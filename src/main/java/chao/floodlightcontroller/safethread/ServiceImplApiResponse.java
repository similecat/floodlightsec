package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.module.IFloodlightService;

/**
 * The standard class for inter-thread communication for API calls response in terms of
 * service implementation
 * 
 * @author shichao
 * 
 */

public class ServiceImplApiResponse extends ApiResponse {
	
	private final FloodlightModuleRunnable thread;
	private final Class<? extends IFloodlightService> caller;
	
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
	
	public Class<? extends IFloodlightService> getCaller() {
		return caller;
	}

}
