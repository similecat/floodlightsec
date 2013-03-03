package chao.floodlightcontroller.safethread;

import chao.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.routing.Route;
import net.floodlightcontroller.util.QueueWriter;

public class ProxyRoutingEngine extends ProxyBase implements IRoutingService{

	protected ProxyRoutingEngine(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> qw) {
		super(id, app, qw);
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
