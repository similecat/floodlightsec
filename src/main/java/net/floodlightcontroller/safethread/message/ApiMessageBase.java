package net.floodlightcontroller.safethread.message;

import net.floodlightcontroller.safethread.FloodlightModuleRunnable;

public abstract class ApiMessageBase {
	private final String method;
	private final long objectId;
	private final FloodlightModuleRunnable app;

	public ApiMessageBase(long id, String method, FloodlightModuleRunnable app) {
		this.method = method;
		this.objectId = id;
		this.app = app;
	}

	public String getMethod() {
		return method;
	}
	
	public long getObjectId(){
		return objectId;
	}
	
	public FloodlightModuleRunnable getCaller() {
		return app;
	}
}
