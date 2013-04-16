package net.floodlightcontroller.safethread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
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
import net.floodlightcontroller.core.module.FloodlightModuleLoader;

public class KernelDeputy implements Runnable {
	protected final QueueReader<ApiRequest> apiRequestQueueReader;
	protected final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with DelegateSanitizer
	protected final Map<Long, Object> id2ObjectMap;  // Shared with DelegateSanitizer
	protected DelegateSanitizer sanitizer = null;
	
	protected static Logger logger = LoggerFactory
			.getLogger(FloodlightModuleLoader.class);
	//public static Object monitor = new Object();	
	//public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
	public KernelDeputy() {
		Object apiMonitor = new Object();
		Queue<ApiRequest> apiQueue = new ConcurrentLinkedQueue<ApiRequest>();
		apiRequestQueueWriter = new QueueWriter<ApiRequest>(apiMonitor, apiQueue);
		apiRequestQueueReader = new QueueReader<ApiRequest>(apiMonitor, apiQueue);
		
		id2ObjectMap = new HashMap<Long, Object>();
	}
	
	public void setSanitizer(DelegateSanitizer s) {
		this.sanitizer = s;
	}
	
	public QueueWriter<ApiRequest> getApiRequestQueueWriter() {
		return apiRequestQueueWriter;
	}

	public Map<Long, Object> getId2ObjectMap() {
		return id2ObjectMap;
	}
	
	@Override
	public void run() {
		while (true) {
			// Wait for incoming API calls
			apiRequestQueueReader.waits();
			
			// Process API calls until queue gets empty
			ApiRequest task = apiRequestQueueReader.read();
			while (task!=null) {
				// Translate request
				Object obj = this.id2ObjectMap.get(task.getObjectId());
				List<Object> args = task.getArgs();
				Class<?>[] argClasses = new Class[args.size()];
				Method method = null;
				Object ret = null;
				
				for(int i=0;i<args.size();i++) {
					argClasses[i] = args.get(i).getClass();
				}
				
				// This approach has issue when parameter involves inherited classes
//				try {
//					method = obj.getClass().getMethod(task.getMethod(), argClasses);
//				} catch (SecurityException e) {
//					method = null;
//				} catch (NoSuchMethodException e) {
//					method = null;
//				}	
				
				// Some ugly pre-processing
				if (obj.getClass().equals(Controller.class) && task.getMethod().equals("addOFMessageListener")) {
					((MessageListenerDelegate)args.get(1)).setSanitizer(this.sanitizer);
				}
				
				
				// Expensive but works
				for (Method m : obj.getClass().getMethods()) {
					if (task.getMethod().equals(m.getName())) {
						boolean matched = true;
						int count = 0;
						for (Class<?> c : m.getParameterTypes()) {
							if (!c.isAssignableFrom(args.get(count++).getClass())) {
								matched = false;
								break;
							}
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
				
				task = apiRequestQueueReader.read();
			}
			
		}

	}
}
