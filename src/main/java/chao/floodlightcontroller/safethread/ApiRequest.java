package chao.floodlightcontroller.safethread;

import java.util.List;

public class ApiRequest extends ApiMessageBase{
	
	private List<Object> args;
	
	public ApiRequest(String method, List<Object> args){
		super(method);
		this.args = args;
	}
	
	public List<Object> getArgs() {
		return args;
	}

	public void setArgs(List<Object> args) {
		this.args = args;
	}
}
