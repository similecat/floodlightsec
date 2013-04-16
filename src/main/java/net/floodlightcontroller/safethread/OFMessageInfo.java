package net.floodlightcontroller.safethread;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFSwitch;

import org.openflow.protocol.OFMessage;

/**
 * The message for inter-thread communication. It encapsulate the event of
 * OFMessage as a single structure
 * 
 * @author shichao
 * 
 */
public class OFMessageInfo {
	private final OFMessage msg;
	private final IOFSwitch sw;
	private final FloodlightContext cntx;

	/**
	 * Constructor
	 * @param msg OFMessage in the communication
	 * @param sw The OFSwitch
	 * @param cntx The FloodlightContext
	 */
	public OFMessageInfo(OFMessage msg, IOFSwitch sw, FloodlightContext cntx) {
		this.msg = msg;
		this.sw = sw;
		this.cntx = cntx;
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
