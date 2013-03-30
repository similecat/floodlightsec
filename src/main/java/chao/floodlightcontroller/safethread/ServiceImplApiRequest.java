package chao.floodlightcontroller.safethread;

import java.util.List;

import net.floodlightcontroller.core.module.IFloodlightService;

public class ServiceImplApiRequest extends ApiRequest {
	private Class<? extends IFloodlightService> caller;

	public  ServiceImplApiRequest (FloodlightModuleRunnable mr,
			Class<? extends IFloodlightService> service, String method,
			List<Object> args) {
		super(mr, method, args);
		this.caller = service;
	}

	public Class<? extends IFloodlightService> getCaller() {
		return caller;
	}

	public void setCaller(Class<? extends IFloodlightService> caller) {
		this.caller = caller;
	}

}
