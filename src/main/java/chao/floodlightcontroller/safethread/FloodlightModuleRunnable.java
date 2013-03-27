package chao.floodlightcontroller.safethread;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.internal.OFSwitchImpl;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;

/**
 * This is the class for the sub-coordinated thread model. The AppThread is the
 * bed where the module is embedded. However, for the module, this AppThread
 * should be transparent.
 * 
 * The AppThread will maintain a list of proxy service implementation and the module is referencing them.
 * However, it can referencing the kernel space components.
 * 
 * @author shichao
 * 
 */
public class FloodlightModuleRunnable implements Runnable {
	private final IFloodlightModule module;
	private final FloodlightModuleContext virtualContext;

	private Queue<ApiRequest> request_queue;
	private Queue<ApiResponse> response_queue;

	/**
	 * (1) Every AppThread will have a map of proxy service implementation in
	 * the AppThread space (user space) which will delegate the module for the
	 * API calls related to this service. On the contrary, the real service
	 * implementation will lie in the SecurityThread (kernel space). The proxy
	 * service implementation will do nothing else but to pass the call to the
	 * real implemenation through the queue we define.
	 * 
	 * (2) There is no need to change the module part except for the init()
	 * method. We will give a "illusion context" to the module making him
	 * believe that he is still referencing those real service implementation.
	 * But actually he is simply referencing those proxy service implementation.
	 * 
	 * 
	 * @param service
	 *            the type of service implemented
	 * @param impl
	 *            the proxy service implementation
	 * 
	 * @return The boolean value indicating whether the addition is successful
	 *         or not. The addition will fail if the proxy service
	 *         implementation providing that service is already in use
	 * 
	 */
	
	public FloodlightModuleRunnable(IFloodlightModule module){
		this.module = module;
		virtualContext = new FloodlightModuleContext();
		for(Class<? extends IFloodlightService> clazz: module.getModuleDependencies()){
			virtualContext.addService(clazz, ProxyServiceImplFactory.instance(clazz, this));
		}
		request_queue = new ConcurrentLinkedQueue<ApiRequest>();
		response_queue = new ConcurrentLinkedQueue<ApiResponse>();
		
	}
	
	public IFloodlightService getProxyServiceImpl(Class<? extends IFloodlightService> service){
		return virtualContext.getServiceImpl(service);
	}
	
	public IFloodlightModule getModule() {
		return module;
	}

	/**
	 * Method for initialize the module with your crafted context. Make sure
	 * that it is called after setting the module
	 */
	public void initModule() {
		try {
			module.init(virtualContext);
		} catch (FloodlightModuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startModule() {
		module.startUp(virtualContext);
	}

	public void writeRequestToQueue(ApiRequest req) {
		request_queue.add(req);
	}

	public ApiResponse readResponseFromQueue() {
		return response_queue.poll();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
