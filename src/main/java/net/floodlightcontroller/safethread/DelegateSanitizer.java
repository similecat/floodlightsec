package net.floodlightcontroller.safethread;

import java.util.Collection;
import java.util.Map;

import org.openflow.protocol.OFMessage;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.core.internal.OFSwitchImpl;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

/**
 * Generate proxy objects from real objects.
 * 
 * @author Xitao Wen
 * 
 */
public class DelegateSanitizer {
	private final Map<Long, Object> id2ObjectMap; // Shared with KernelDeputy
	private final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with
																	// KernelDeputy
	private long idBase;

	public DelegateSanitizer(Map<Long, Object> idMap, QueueWriter<ApiRequest> qw) {
		this.id2ObjectMap = idMap;
		this.apiRequestQueueWriter = qw;
	}

	public FloodlightProviderDelegate getFloodlightProviderDelegate(
			IFloodlightProviderService iprovider, FloodlightModuleRunnable app) {
		if (iprovider instanceof FloodlightProviderDelegate) {
			iprovider = (IFloodlightProviderService) this.id2ObjectMap
					.get(((FloodlightProviderDelegate) iprovider).getObjectId());
		} else if (!(iprovider instanceof Controller))
			return null;

		this.id2ObjectMap.put(idBase, iprovider);
		FloodlightProviderDelegate p = new FloodlightProviderDelegate(
				this.idBase++, app, this.apiRequestQueueWriter);
		return p;
	}

	public FloodlightModuleContext getFloodlightModuleContextDelegate(
			FloodlightModuleContext cntx, FloodlightModuleRunnable app) {
		FloodlightModuleContext ret = new FloodlightModuleContext();

		Collection<Class<? extends IFloodlightService>> servs = app
				.getModuleDependencies();
		for (Class<? extends IFloodlightService> s : servs) {
			ret.addService(s, this.sanitize(cntx.getServiceImpl(s), app));
		}

		return ret;
	}

	public IFloodlightService sanitize(IFloodlightService s,
			FloodlightModuleRunnable app) {
		if (s instanceof IFloodlightProviderService) {
			return this.getFloodlightProviderDelegate(
					(IFloodlightProviderService) s, app);
		} else {
			return null;
		}
	}

	public IOFSwitch getOFSwitchDelegate(IOFSwitch sw,
			FloodlightModuleRunnable app) {
		if (sw instanceof OFSwitchDelegate) {
			sw = (IOFSwitch) this.id2ObjectMap.get(((OFSwitchDelegate) sw)
					.getObjectId());
		} else if (!(sw instanceof OFSwitchImpl))
			return null;

		this.id2ObjectMap.put(idBase, sw);
		OFSwitchDelegate ssw = new OFSwitchDelegate(this.idBase++, app,
				this.apiRequestQueueWriter);
		return ssw;
	}

	public OFMessage sanitizeOFMessage(OFMessage msg,
			FloodlightModuleRunnable app) {
		// TODO Auto-generated method stub
		return msg;
	}

	public FloodlightContext sanitizeFloodlightContext(FloodlightContext cntx,
			FloodlightModuleRunnable app) {
		// TODO Auto-generated method stub
		return cntx;
	}

}
