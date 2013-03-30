package chao.floodlightcontroller.safethread;

import java.util.List;

public class OFSwitchApiRequest extends ApiRequest {

	private long id;

	public OFSwitchApiRequest(FloodlightModuleRunnable mr, long swId,
			String method, List<Object> args) {
		super(mr, method, args);
		this.id = swId;
	}

	public long getSwitchId() {
		return id;
	}

	public void setSwitchId(long id) {
		this.id = id;
	}

}
