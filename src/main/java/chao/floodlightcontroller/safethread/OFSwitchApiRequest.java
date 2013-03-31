package chao.floodlightcontroller.safethread;

import java.util.List;

import net.floodlightcontroller.core.IOFSwitch;

public class OFSwitchApiRequest extends ApiRequest {

	private final IOFSwitch sw;

	public OFSwitchApiRequest(IOFSwitch sw, String method, List<Object> args) {
		super(method, args);
		this.sw = sw;
	}

	public IOFSwitch getOFSwitch() {
		return sw;
	}
	
}
