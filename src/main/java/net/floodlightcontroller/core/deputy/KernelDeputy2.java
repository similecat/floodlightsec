package net.floodlightcontroller.core.deputy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IListener.Command;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.core.internal.OFSwitchForApp;
import net.floodlightcontroller.core.internal.OFSwitchImpl;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import chao.floodlightcontroller.safethread.message.ApiRequest;

/*
public class KernelDeputy2 implements Runnable {

	private static KernelDeputy2 ins;

	// Members:
	// (1) A monitor for locking
	// (2) A queue for reading inbound ApiRequest
	// (3) The knowledge of the real context, it does not add new dependencies
	private Object monitor;
	private Queue<ApiRequest> taskQueue;
	private FloodlightModuleContext context;

	private KernelDeputy2() {
		this.monitor = new Object();
		this.taskQueue = new ConcurrentLinkedQueue<ApiRequest>();
	}

	private KernelDeputy2(FloodlightModuleContext context) {
		this();
		this.context = context;
	}

	public static KernelDeputy2 getInstance() {
		if (ins == null) {
			ins = new KernelDeputy2();
		}
		return ins;
	}

	public void writeRequestToQueue(ApiRequest req) {
		this.taskQueue.add(req);
		this.notifyAll();
	}

	public ApiRequest readRequestFromQueue() {
		while (this.taskQueue.isEmpty()) {
			synchronized (this) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// should not enter here
				}
			}
		}
		return this.taskQueue.poll();
	}

	public void informCommand(Command cmd) {
		// TODO we know now Controller is the only class implementing
		// IFloodlightProviderService
		Controller controller = (Controller) context
				.getServiceImpl(IFloodlightProviderService.class);
		controller.notifyAll();
	}

	@Override
	public void run() {
		while (true) {
			ApiRequest req = this.readRequestFromQueue();
			if (req instanceof ServiceImplApiRequest) {
				handleServiceImplApiRequest((ServiceImplApiRequest) req);
			} else if (req instanceof OFSwitchApiRequest) {
				handleOFSwitchApiRequest((OFSwitchApiRequest) req);
			}
		}

	}

	private void handleOFSwitchApiRequest(OFSwitchApiRequest req) {
		String m = req.getMethod();
		List<Object> args = req.getArgs();
		List<Class<?>> argClass = new ArrayList<Class<?>>();
		for (Object obj : args) {
			argClass.add(obj.getClass());
		}
		Method method = ReflectedMethodExecutor.searchMethod(OFSwitchImpl.class, m, argClass);

		OFSwitchForApp sw = (OFSwitchForApp) req.getOFSwitch();
		OFSwitchImpl swReal = this.getRealSwitch(sw);
		
	}

	private void handleServiceImplApiRequest(ServiceImplApiRequest req) {
		// TODO Auto-generated method stub

	}

	private OFSwitchImpl getRealSwitch(OFSwitchForApp sw) {
		return null;
	}
	
	private static class ReflectedMethodExecutor{
		
		public static Method searchMethod(Class<?> clazz, String name,
				List<Class<?>> argClass) {
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if (!method.getName().equals(name)) {
					continue;
				}
				if (method.getParameterTypes().length != argClass.size()) {
					continue;
				}

				boolean matched = true;
				for (int i = 0; i < method.getParameterTypes().length; i++) {
					if (!method.getParameterTypes()[i].equals(argClass.get(i))) {
						matched = false;
						break;
					}
				}
				if (!matched) {
					continue;
				} else {
					return method;
				}
			}
			return null;
		}

		public static void execute(Object obj, Method method, List<Object> args){
			if(obj instanceof OFSwitchImpl){
				
			}
		}
	}
	
}
*/