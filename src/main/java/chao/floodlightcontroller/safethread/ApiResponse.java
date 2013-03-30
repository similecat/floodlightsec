package chao.floodlightcontroller.safethread;

public class ApiResponse extends ApiMessageBase{
	private Object r;
	
	public ApiResponse(FloodlightModuleRunnable thread, String method, Object returnValue) {
		super(thread, method);
		r = returnValue;
	}

	public Object getReturnValue(){
		return r;
	}
	
	public void setReturnValue(Object returnValue){
		r = returnValue;
	}
}
