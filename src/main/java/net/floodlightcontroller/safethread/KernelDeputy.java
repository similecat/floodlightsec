package net.floodlightcontroller.safethread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.safethread.message.ApiResponse;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.devicemanager.internal.DeviceManagerImpl;

public class KernelDeputy implements Runnable {
	protected final QueueReader<ApiRequest> apiRequestQueueReader;
	protected final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with DelegateSanitizer
	protected final Map<Long, Object> id2ObjectMap;  // Shared with DelegateSanitizer
	protected DelegateSanitizer sanitizer = null;
	
	protected static Logger logger = LoggerFactory
			.getLogger(KernelDeputy.class);
	//public static Object monitor = new Object();	
	//public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
	public KernelDeputy(Map<Long, Object> idMap) {
		Object apiMonitor = new Object();
		Queue<ApiRequest> apiQueue = new ConcurrentLinkedQueue<ApiRequest>();
		apiRequestQueueWriter = new QueueWriter<ApiRequest>(apiMonitor, apiQueue);
		apiRequestQueueReader = new QueueReader<ApiRequest>(apiMonitor, apiQueue);
		
		id2ObjectMap = idMap;
	}
	
	public void setSanitizer(DelegateSanitizer s) {
		this.sanitizer = s;
	}
	
	public QueueWriter<ApiRequest> getApiRequestQueueWriter() {
		return apiRequestQueueWriter;
	}

//	public Map<Long, Object> getId2ObjectMap() {
//		return id2ObjectMap;
//	}
	
	@Override
	public void run() {
		int workerCount = 0;
		while (true) {
			// Wait for incoming API calls
			apiRequestQueueReader.waitsNoTimeout();
			ApiRequest task = apiRequestQueueReader.read();
			
			// Process API calls until queue gets empty
//			ApiRequest task = apiRequestQueueReader.pollingRead();
			while (task!=null) {
				TaskWorker tw = new TaskWorker();
				tw.setTask(task);
				new Thread(tw,"TaskWorker-" + workerCount++).start();
				
				//logger.debug("Kernel queue length: {}", apiRequestQueueReader.queue.size());
				task = apiRequestQueueReader.read();
			}			
		}
	}
	
	class TaskWorker implements Runnable {
		private ApiRequest task;
		
		public void setTask(ApiRequest r) {
			task = r;
		}
		
		public void run() {
			// Translate request
			Object obj = id2ObjectMap.get(task.getObjectId());
			List<Object> args = task.getArgs();
			Class<?>[] argClasses = new Class[args.size()];
			Method method = null;
			Object ret = null;
			
			for(int i=0;i<args.size();i++) {
				if (args.get(i) != null) {
					argClasses[i] = args.get(i).getClass();
				}
				else {
					argClasses[i] = null;
				}
			}
			
			// This approach has issue when parameter involves inherited classes
//			try {
//				method = obj.getClass().getMethod(task.getMethod(), argClasses);
//			} catch (SecurityException e) {
//				method = null;
//			} catch (NoSuchMethodException e) {
//				method = null;
//			}	
			
			// Some ugly pre-processing
			if (obj.getClass().equals(Controller.class)
					&& task.getMethod().equals("addOFMessageListener")) {
				((MessageListenerDelegate) args.get(1)).setSanitizer(sanitizer);
			} else if (obj.getClass().equals(DeviceManagerImpl.class)
					&& task.getMethod().equals("addListener")) {
				((DeviceListenerDelegate) args.get(0)).setSanitizer(sanitizer);
			}
			
			
			// Expensive but works
			for (Method m : obj.getClass().getMethods()) {
				if (m.getParameterTypes().length != argClasses.length)
					continue;

				if (task.getMethod().equals(m.getName())) {
					boolean matched = true;
					int count = 0;
					for (Class<?> c : m.getParameterTypes()) {
						if (argClasses[count]!=null && !c.isAssignableFrom(argClasses[count])) {
							if ((c.equals(long.class) && argClasses[count].equals(Long.class)) ||
									(c.equals(short.class) && argClasses[count].equals(Short.class)) ||
									(c.equals(int.class) && argClasses[count].equals(Integer.class)) ||
									(c.equals(boolean.class) && argClasses[count].equals(Boolean.class)) ||
									(c.equals(char.class) && argClasses[count].equals(Character.class)) ||
									(c.equals(byte.class) && argClasses[count].equals(Byte.class)) ||
									(c.equals(float.class) && argClasses[count].equals(Float.class)) ||
									(c.equals(double.class) && argClasses[count].equals(Double.class))) {
								// still matched, do nothing
							} else {	
								matched = false;
								break;
							}
						}
						count++;
					}
					if (matched == true) {
						method = m;
						break;
					}
				}
			}
			if (method == null) {
				logger.debug("No method matched: {}.{}()", new Object[]{obj.getClass(), task.getMethod()});
			}
			
			// TODO: Check permissions
			
			// Execute request
			try {
				if (method != null) {
					ret = method.invoke(obj, args.toArray());
				}
			} catch (IllegalArgumentException e) {
				logger.debug("Should not reach here: {}", e);
			} catch (IllegalAccessException e) {
				logger.debug("Should not reach here: {}", e);
			} catch (InvocationTargetException e) {
				logger.debug("Something inside the call goes wrong: {}", e);
			}	
			
			// Send back response if necessary
			if (task.getQueueWriter() != null) {
				ApiResponse response = new ApiResponse(
						task.getObjectId(), task.getMethod(),
						task.getCaller(), ret);

				task.getQueueWriter().write(response);
				task.getQueueWriter().notifies();
			}			
		}
	}
}
