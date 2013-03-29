package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFSwitch;

import org.openflow.protocol.OFMessage;

public class OFMessageInfo {
	private OFMessage msg;
	private IOFSwitch sw;
	private FloodlightContext cntx;

	public OFMessageInfo(OFMessage msg, IOFSwitch sw, FloodlightContext cntx) {
		this.msg = msg;
		this.sw = sw;
		this.cntx = cntx;
	}

	public OFMessageInfo() {
		// TODO Auto-generated constructor stub
	}

	public OFMessage getOFMessage() {
		return msg;
	}

	public void setOFMessage(OFMessage msg) {
		this.msg = msg;
	}

	public IOFSwitch getOFSwitch() {
		return sw;
	}

	public void setOFSwitch(IOFSwitch sw) {
		this.sw = sw;
	}

	public FloodlightContext getFloodlightContext() {
		return cntx;
	}

	public void setFloodlightContext(FloodlightContext cntx) {
		this.cntx = cntx;
	}
	
	@Override
	public int hashCode(){
		int prime = 107;
		int result = 1;
		result = prime * result + msg.hashCode();
		result = prime * result + sw.hashCode();
		result = prime * result + cntx.hashCode();
		return result;
	}
}
