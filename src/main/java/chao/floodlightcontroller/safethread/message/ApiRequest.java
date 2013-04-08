package chao.floodlightcontroller.safethread.message;

import java.util.List;

/**
 * The class for the inter-thread communication, the format of Api Call request Base Class
 * @author shichao
 *
 */

public class ApiRequest extends ApiMessageBase{
	
	private final List<Object> args;
	
	public ApiRequest(long id, String method, List<Object> args){
		super(id, method);
		this.args = args;
	}
	
	/**
	 * Get the list of arguments as a list of objects
	 * @return
	 */
	public List<Object> getArgs() {
		return args;
	}

}