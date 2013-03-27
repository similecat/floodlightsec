package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.routing.Route;

public class ProxyRoutingEngine extends ProxyBase implements IRoutingService{

	protected ProxyRoutingEngine(FloodlightModuleRunnable thread) {
		super(thread);
	}

	@Override
	public Route getRoute(long src, long dst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Route getRoute(long src, long dst, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Route getRoute(long srcId, short srcPort, long dstId, short dstPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Route getRoute(long srcId, short srcPort, long dstId, short dstPort,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean routeExists(long src, long dst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean routeExists(long src, long dst, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

}
