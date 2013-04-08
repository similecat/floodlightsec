package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.topology.ITopologyService;

public class ProxyServiceImplFactory {

	public static IFloodlightService instanceServiceImpl(
			Class<? extends IFloodlightService> clazz,
			FloodlightModuleRunnable thread) {
		long id;
		IFloodlightService instance;
		//TODO look up id
		id = 0;
		if (clazz == IFloodlightProviderService.class) {
			instance = new ProxyFloodlightProvider(0, thread);
		} else{
			return null;
		}
		
		//TODO Update the map with <id, instance>
		return instance;
	}
	
	public static IOFSwitch instanceSwitch(){
		return null;
	}

}
