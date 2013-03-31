package chao.floodlightcontroller.safethread;

import java.util.List;

import net.floodlightcontroller.core.module.IFloodlightService;

public class ServiceImplApiRequest extends ApiRequest {
	
	private Class<? extends IFloodlightService> caller;
	private FloodlightModuleRunnable thread;
	
	public  ServiceImplApiRequest (FloodlightModuleRunnable thread,
			Class<? extends IFloodlightService> service, String method,
			List<Object> args) {
		super(method, args);
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
