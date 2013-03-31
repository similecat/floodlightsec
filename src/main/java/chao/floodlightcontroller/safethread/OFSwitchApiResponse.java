package chao.floodlightcontroller.safethread;

import net.floodlightcontroller.core.IOFSwitch;

public class OFSwitchApiResponse extends ApiResponse {
	private IOFSwitch sw;

	public OFSwitchApiResponse(IOFSwitch sw, String method, Object returnValue) {
		super(method, returnValue);
		this.setOFSwitch(sw);
	}

	public IOFSwitch getOFSwitch() {
		return sw;
	}

	public void setOFSwitch(IOFSwitch sw) {
		this.sw = sw;
	}

	

}
