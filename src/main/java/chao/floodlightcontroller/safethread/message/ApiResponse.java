package chao.floodlightcontroller.safethread.message;

import chao.floodlightcontroller.safethread.FloodlightModuleRunnable;

/**
 * The class for the inter-thread communication, the format of Api Call response Base Class
 * @author shichao
 *
 */
public class ApiResponse extends ApiMessageBase{
	private final Object returnValue;
	
	/**
	 * 
	 * @param method String representing the method name
	 * @param returnValue The return value which is final
	 */
	public ApiResponse(long id, String method, FloodlightModuleRunnable app, Object r) {
		super(id, method, app);
		returnValue = r;
	}

	/**
	 * Get the return value of the Api Call
	 * @return
	 */
	public Object getReturnValue(){
		return returnValue;
	}
	
}
