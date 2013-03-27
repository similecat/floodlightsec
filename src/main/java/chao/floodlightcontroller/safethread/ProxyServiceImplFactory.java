package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.topology.ITopologyService;

public class ProxyServiceImplFactory {

	public static IFloodlightService instance(
			Class<? extends IFloodlightService> clazz, FloodlightModuleRunnable thread) {
		if(clazz == IFloodlightProviderService.class){
			return new ProxyFloodlightProvider(thread);
		} else if(clazz == IRoutingService.class){
			return new ProxyRoutingEngine(thread);
		} else if(clazz == ITopologyService.class){
			return new ProxyTopologyManager(thread);
		} else{
			return null;
		}
	}

}
