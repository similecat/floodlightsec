package chao.floodlightcontroller.safethread;

import java.util.Date;
import java.util.List;
import java.util.Set;

import net.floodlightcontroller.linkdiscovery.ILinkDiscovery.LDUpdate;
import net.floodlightcontroller.topology.ITopologyListener;
import net.floodlightcontroller.topology.ITopologyService;
import net.floodlightcontroller.topology.NodePortTuple;

public class ProxyTopologyManager extends ProxyBase implements ITopologyService {

	protected ProxyTopologyManager(FloodlightModuleRunnable thread) {
		super(thread);
	}

	@Override
	public void addListener(ITopologyListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Date getLastUpdateTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAttachmentPointPort(long switchid, short port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAttachmentPointPort(long switchid, short port,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getOpenflowDomainId(long switchId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getOpenflowDomainId(long switchId, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getL2DomainId(long switchId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getL2DomainId(long switchId, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean inSameOpenflowDomain(long switch1, long switch2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inSameOpenflowDomain(long switch1, long switch2,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inSameL2Domain(long switch1, long switch2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inSameL2Domain(long switch1, long switch2,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBroadcastDomainPort(long sw, short port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBroadcastDomainPort(long sw, short port,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAllowed(long sw, short portId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAllowed(long sw, short portId, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConsistent(long oldSw, short oldPort, long newSw,
			short newPort) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConsistent(long oldSw, short oldPort, long newSw,
			short newPort, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInSameBroadcastDomain(long s1, short p1, long s2, short p2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInSameBroadcastDomain(long s1, short p1, long s2,
			short p2, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Short> getPortsWithLinks(long sw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Short> getPortsWithLinks(long sw, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Short> getBroadcastPorts(long targetSw, long src, short srcPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Short> getBroadcastPorts(long targetSw, long src, short srcPort,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isIncomingBroadcastAllowed(long sw, short portId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIncomingBroadcastAllowed(long sw, short portId,
			boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NodePortTuple getOutgoingSwitchPort(long src, short srcPort,
			long dst, short dstPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getOutgoingSwitchPort(long src, short srcPort,
			long dst, short dstPort, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getIncomingSwitchPort(long src, short srcPort,
			long dst, short dstPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getIncomingSwitchPort(long src, short srcPort,
			long dst, short dstPort, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getAllowedOutgoingBroadcastPort(long src,
			short srcPort, long dst, short dstPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getAllowedOutgoingBroadcastPort(long src,
			short srcPort, long dst, short dstPort, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getAllowedIncomingBroadcastPort(long src, short srcPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodePortTuple getAllowedIncomingBroadcastPort(long src,
			short srcPort, boolean tunnelEnabled) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<NodePortTuple> getBroadcastDomainPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<NodePortTuple> getTunnelPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<NodePortTuple> getBlockedPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LDUpdate> getLastLinkUpdates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Short> getPorts(long sw) {
		// TODO Auto-generated method stub
		return null;
	}

}
