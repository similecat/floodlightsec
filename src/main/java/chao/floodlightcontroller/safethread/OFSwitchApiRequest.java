package chao.floodlightcontroller.safethread;

import java.lang.reflect.Method;
import java.util.List;


public class OFSwitchApiRequest extends ApiRequest{
	private long id;
	
	public static OFSwitchApiRequest create(FloodlightModuleRunnable mr,
			long swId, Method method,
			List<Object> args) {
		OFSwitchApiRequest req = new OFSwitchApiRequest();
		req.setModuleRunnable(mr);
		req.setMethod(method);
		req.setArgs(args);
		req.setSwitchId(swId);
		return req;
	}

	public long getSwitchId() {
		return id;
	}

	private void setSwitchId(long id) {
		this.id = id;
	}

	
}
