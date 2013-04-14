package chao.floodlightcontroller.safethread;

import java.util.Collection;
import java.util.Map;

import chao.floodlightcontroller.safethread.message.ApiRequest;

import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.util.QueueWriter;

/**
 * Generate proxy objects from real objects.
 * @author Xitao Wen
 *
 */
public class DelegateSanitizer {	
	private final Map<Long, Object> id2ObjectMap;  // Shared with KernelDeputy
	private final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with KernelDeputy	 
	private long idBase;
	
	public DelegateSanitizer(Map<Long, Object> idMap, QueueWriter<ApiRequest> qw) {
		this.id2ObjectMap = idMap;
		this.apiRequestQueueWriter = qw;
	}
	
	public FloodlightProviderDelegate getFloodlightProviderDelegate(IFloodlightProviderService iprovider, 
			FloodlightModuleRunnable app) {
		if(!(iprovider instanceof Controller))
			return null;
		
		this.id2ObjectMap.put(idBase, iprovider);
		FloodlightProviderDelegate proxy = new FloodlightProviderDelegate(this.idBase++, app, this.apiRequestQueueWriter);
		return proxy;
	}

	public FloodlightModuleContext getFloodlightModuleContextDelegate(FloodlightModuleContext cntx, 
			FloodlightModuleRunnable app) {
		FloodlightModuleContext ret = new FloodlightModuleContext();
		
		Collection<Class<? extends IFloodlightService>> servs = app.getModuleDependencies();
		for (Class<? extends IFloodlightService> s : servs) {
			ret.addService(s, this.sanitize(cntx.getServiceImpl(s), app));
		}
		
		return ret;		
	}
	
	public IFloodlightService sanitize(IFloodlightService s, FloodlightModuleRunnable app) {
		if (s instanceof IFloodlightProviderService) {
			return this.getFloodlightProviderDelegate((IFloodlightProviderService)s, app);
		}
		else {		
			return null;
		}
	}
	
}
