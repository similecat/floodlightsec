package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.IOFSwitch;

public class OFSwitchApiResponse extends ApiResponse {
	private final IOFSwitch sw;

	public OFSwitchApiResponse(IOFSwitch sw, String method, Object returnValue) {
		super(method, returnValue);
		this.sw = sw;
	}

	public IOFSwitch getOFSwitch() {
		return sw;
	}

}
