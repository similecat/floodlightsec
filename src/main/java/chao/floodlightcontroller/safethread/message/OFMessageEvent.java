package chao.floodlightcontroller.safethread.message;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.util.QueueWriter;

import org.openflow.protocol.OFMessage;

import chao.floodlightcontroller.safethread.FloodlightModuleRunnable;

/**
 * The message for inter-thread communication. It encapsulate the event of
 * OFMessage as a single structure
 * 
 * @author shichao
 * 
 */
public class OFMessageEvent extends OFEvent{
	private final FloodlightModuleRunnable receiver;
	private final OFMessage msg;
	private final IOFSwitch sw;
	private final FloodlightContext cntx;

	/**
	 * Constructor
	 * @param msg OFMessage in the communication
	 * @param sw The OFSwitch
	 * @param cntx The FloodlightContext
	 */
	public OFMessageEvent(QueueWriter<OFEventResponse> qw, FloodlightModuleRunnable receiver, OFMessage msg, IOFSwitch sw, FloodlightContext cntx) {
		super(OFEvent.Type.OFMessage, qw);
		this.receiver = receiver;
		this.msg = msg;
		this.sw = sw;
		this.cntx = cntx;
	}

	public FloodlightModuleRunnable getEventReceiver(){
		return this.receiver;
	}
	
	public OFMessage getOFMessage() {
		return msg;
	}

	public IOFSwitch getOFSwitch() {
		return sw;
	}

	public FloodlightContext getFloodlightContext() {
		return cntx;
	}

}
