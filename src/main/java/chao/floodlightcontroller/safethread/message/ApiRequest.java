package chao.floodlightcontroller.safethread.message;

import java.util.List;

import chao.floodlightcontroller.safethread.FloodlightModuleRunnable;

import net.floodlightcontroller.util.QueueWriter;

/**
 * The class for the inter-thread communication, the format of Api Call request Base Class
 * @author shichao
 *
 */

public class ApiRequest extends ApiMessageBase{
	
	private final List<Object> args;
	private final QueueWriter<ApiResponse> queueWriter;
	
	public ApiRequest(long object, String method,FloodlightModuleRunnable app, List<Object> args, QueueWriter<ApiResponse> queue){
		super(object, method, app);
		this.args = args;
		this.queueWriter = queue;
	}
	
	/**
	 * Get the list of arguments as a list of objects
	 * @return
	 */
	public List<Object> getArgs() {
		return args;
	}
	
	public QueueWriter<ApiResponse> getQueueWriter(){
		return queueWriter;
	}

}
