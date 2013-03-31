package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.module.IFloodlightService;

public class ServiceImplApiResponse extends ApiResponse {
	
	private FloodlightModuleRunnable thread;
	private Class<? extends IFloodlightService> caller;
	
	public ServiceImplApiResponse(FloodlightModuleRunnable thread,
			Class<? extends IFloodlightService> service, String method,
			Object returnValue) {
		super(method, returnValue);
		this.thread = thread;
		this.caller = service;
	}

	public FloodlightModuleRunnable getModuleRunnable() {
		return thread;
	}

	public void setModuleRunnable(FloodlightModuleRunnable thread) {
		this.thread = thread;
	}
	
	public Class<? extends IFloodlightService> getCaller() {
		return caller;
	}

	public void setCaller(Class<? extends IFloodlightService> caller) {
		this.caller = caller;
	}

}
