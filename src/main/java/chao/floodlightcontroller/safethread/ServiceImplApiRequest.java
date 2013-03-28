package chao.floodlightcontroller.safethread;

import java.lang.reflect.Method;
import java.util.List;

import net.floodlightcontroller.core.module.IFloodlightService;

public class ServiceImplApiRequest extends ApiRequest {
	private Class<? extends IFloodlightService> caller;

	public static ServiceImplApiRequest create(FloodlightModuleRunnable mr,
			Class<? extends IFloodlightService> service, String method,
			List<Object> args) {
		ServiceImplApiRequest req = new ServiceImplApiRequest();
		req.setModuleRunnable(mr);
		req.setMethod(method);
		req.setArgs(args);
		req.setCaller(service);
		return req;
	}

	public Class<? extends IFloodlightService> getCaller() {
		return caller;
	}

	private void setCaller(Class<? extends IFloodlightService> caller) {
		this.caller = caller;
	}

}
