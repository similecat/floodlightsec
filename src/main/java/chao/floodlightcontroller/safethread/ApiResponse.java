package chao.floodlightcontroller.safethread;

public class ApiResponse extends ApiMessageBase{
	private Object r;
	
	public ApiResponse(String method, Object returnValue) {
		super(method);
		r = returnValue;
	}

	public Object getReturnValue(){
		return r;
	}
	
	public void setReturnValue(Object returnValue){
		r = returnValue;
	}
}
