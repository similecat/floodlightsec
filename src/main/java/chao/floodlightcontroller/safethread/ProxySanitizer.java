package chao.floodlightcontroller.safethread;

import java.util.Map;

import chao.floodlightcontroller.safethread.message.ApiRequest;

import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.util.QueueWriter;

/**
 * Generate proxy objects from real objects.
 * @author Xitao Wen
 *
 */
public class ProxySanitizer {	
	private final Map<Long, Object> id2ObjectMap;  // Shared with KernelDeputy
	private final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with KernelDeputy	 
	private long idBase;
	
	public ProxySanitizer(Map<Long, Object> idMap, QueueWriter<ApiRequest> qw) {
		this.id2ObjectMap = idMap;
		this.apiRequestQueueWriter = qw;
	}
	
	public ProxyFloodlightProvider getProxyFloodlightProvider(IFloodlightProviderService iprovider, 
			FloodlightModuleRunnable app) {
		if(!(iprovider instanceof Controller))
			return null;
		
		this.id2ObjectMap.put(idBase, iprovider);
		ProxyFloodlightProvider proxy = new ProxyFloodlightProvider(this.idBase++, app, this.apiRequestQueueWriter);
		return proxy;
	}
	
}
