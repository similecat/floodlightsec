package chao.floodlightcontroller.safethread;

import java.util.List;

import net.floodlightcontroller.core.module.IFloodlightService;

/**
 * The standard class for inter-thread communication for API calls request in terms of
 * service implementation
 * 
 * @author shichao
 * 
 */
public class ServiceImplApiRequest extends ApiRequest {

	private final Class<? extends IFloodlightService> caller;
	private final FloodlightModuleRunnable thread;

	public ServiceImplApiRequest(FloodlightModuleRunnable thread,
			Class<? extends IFloodlightService> service, String method,
			List<Object> args) {
		super(method, args);
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
