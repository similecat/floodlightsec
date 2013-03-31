package chao.floodlightcontroller.safethread;

/**
 * The class for the inter-thread communication, the format of Api Call response Base Class
 * @author shichao
 *
 */
public class ApiResponse extends ApiMessageBase{
	private final Object r;
	
	/**
	 * 
	 * @param method String representing the method name
	 * @param returnValue The return value which is final
	 */
	public ApiResponse(String method, Object returnValue) {
		super(method);
		r = returnValue;
	}

	/**
	 * Get the return value of the Api Call
	 * @return
	 */
	public Object getReturnValue(){
		return r;
	}
	
}
