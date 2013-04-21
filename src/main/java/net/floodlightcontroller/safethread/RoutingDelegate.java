package net.floodlightcontroller.safethread;

import java.util.Arrays;

import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.routing.Route;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

public class RoutingDelegate extends DelegateBase implements IRoutingService {

	public RoutingDelegate(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> kw) {
		super(id, app, kw);
	}
	
	@Override
	public Route getRoute(long src, long dst) {
		Long oSrcId = src, oDstId = dst;
		Object r = apiRequestSync("getRoute", Arrays.asList((Object) oSrcId,
				(Object) oDstId));
		if (r == null || !(r instanceof Route)) {
			return null;
		}
		else {
			return (Route) r;
		}
	}

	@Override
	public Route getRoute(long src, long dst, boolean tunnelEnabled) {
		Long oSrcId = src, oDstId = dst;
		Boolean oTunnel = tunnelEnabled;
		Object r = apiRequestSync("getRoute", Arrays.asList((Object) oSrcId,
				(Object) oDstId, (Object) oTunnel));
		if (r == null || !(r instanceof Route)) {
			return null;
		}
		else {
			return (Route) r;
		}
	}

	@Override
	public Route getRoute(long srcId, short srcPort, long dstId, short dstPort) {
		// Forwarding
		Long oSrcId = srcId, oDstId = dstId;
		Short oSrcPort = srcPort, oDstPort = dstPort;
		Object r = apiRequestSync("getRoute", Arrays.asList((Object) oSrcId,
				(Object) oSrcPort, (Object) oDstId, (Object) oDstPort));
		if (r == null || !(r instanceof Route)) {
			return null;
		}
		else {
			return (Route) r;
		}
	}

	@Override
	public Route getRoute(long srcId, short srcPort, long dstId, short dstPort,
			boolean tunnelEnabled) {
		Long oSrcId = srcId, oDstId = dstId;
		Short oSrcPort = srcPort, oDstPort = dstPort;
		Boolean oTunnel = tunnelEnabled;
		Object r = apiRequestSync("getRoute", Arrays.asList((Object) oSrcId,
				(Object) oSrcPort, (Object) oDstId, (Object) oDstPort, (Object) oTunnel));
		if (r == null || !(r instanceof Route)) {
			return null;
		}
		else {
			return (Route) r;
		}
	}
	
//////////////////////////////////////////////////
//Interface methods that haven't been supported
//////////////////////////////////////////////////

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
