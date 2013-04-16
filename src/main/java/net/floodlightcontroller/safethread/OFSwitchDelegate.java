package net.floodlightcontroller.safethread;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.jboss.netty.channel.Channel;
import org.openflow.protocol.OFFeaturesReply;
import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFPhysicalPort;
import org.openflow.protocol.OFStatisticsRequest;
import org.openflow.protocol.statistics.OFDescriptionStatistics;
import org.openflow.protocol.statistics.OFStatistics;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.IFloodlightProviderService.Role;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

public class OFSwitchDelegate extends DelegateBase implements IOFSwitch {
	
	public OFSwitchDelegate(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> qw) {
		super(id, app, qw);
	}
	
	@Override
	public void write(OFMessage m, FloodlightContext bc) throws IOException {
		apiRequestAsync("write", Arrays.asList(m,bc));
	}

	@Override
	public void write(List<OFMessage> msglist, FloodlightContext bc)
			throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void disconnectOutputStream() {
		// TODO Auto-generated method stub

	}

	@Override
	public Channel getChannel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBuffers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getActions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCapabilities() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte getTables() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFeaturesReply(OFFeaturesReply featuresReply) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSwitchProperties(OFDescriptionStatistics description) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<OFPhysicalPort> getEnabledPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Short> getEnabledPortNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OFPhysicalPort getPort(short portNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OFPhysicalPort getPort(String portName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPort(OFPhysicalPort port) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePort(short portNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePort(String portName) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<OFPhysicalPort> getPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean portEnabled(short portName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean portEnabled(String portName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean portEnabled(OFPhysicalPort port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getObjectId() {
		return this.id;
	}

	@Override
	public String getStringId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Object, Object> getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getConnectedSince() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextTransactionId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Future<List<OFStatistics>> getStatistics(OFStatisticsRequest request)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<OFFeaturesReply> getFeaturesReplyFromSwitch()
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deliverOFFeaturesReply(OFMessage reply) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelFeaturesReply(int transactionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setConnected(boolean connected) {
		// TODO Auto-generated method stub

	}

	@Override
	public Role getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deliverStatisticsReply(OFMessage reply) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelStatisticsReply(int transactionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelAllStatisticsReplies() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasAttribute(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAllFlowMods() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateBroadcastCache(Long entry, Short port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Short, Long> getPortBroadcastHits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendStatsQuery(OFStatisticsRequest request, int xid,
			IOFMessageListener caller) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}



}
