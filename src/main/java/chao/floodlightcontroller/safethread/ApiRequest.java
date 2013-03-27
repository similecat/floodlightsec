package chao.floodlightcontroller.safethread;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import net.floodlightcontroller.core.module.IFloodlightService;

public class ApiRequest {
	private FloodlightModuleRunnable thread;
	private Method method;
	private List<Object> args;
	
	public FloodlightModuleRunnable getModuleRunnable() {
		return thread;
	}

	public void setModuleRunnable(FloodlightModuleRunnable thread) {
		this.thread = thread;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public List<Object> getArgs() {
		return args;
	}

	public void setArgs(List<Object> args2) {
		this.args = args2;
	}
}
