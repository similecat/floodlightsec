package net.floodlightcontroller.safethread;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.openflow.protocol.OFMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.core.internal.OFSwitchImpl;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.counter.ICounterStoreService;
import net.floodlightcontroller.devicemanager.IDevice;
import net.floodlightcontroller.devicemanager.IDeviceService;
import net.floodlightcontroller.devicemanager.internal.Device;
import net.floodlightcontroller.devicemanager.internal.DeviceManagerImpl;
import net.floodlightcontroller.restserver.IRestApiService;
import net.floodlightcontroller.routing.IRoutingService;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.storage.AbstractStorageSource;
import net.floodlightcontroller.storage.IStorageSourceService;
import net.floodlightcontroller.topology.ITopologyService;
import net.floodlightcontroller.topology.TopologyManager;
import net.floodlightcontroller.util.Pair;
import net.floodlightcontroller.util.QueueWriter;

/**
 * Generate proxy objects from real objects.
 * 
 * @author Xitao Wen
 * 
 */
public class DelegateSanitizer {
	private final Map<Long, Object> id2ObjectMap; // Shared with KernelDeputy
												  // DelegateSanitizer is the only place inserting
												  // items in to this map.
	private final Map<Long, Object> id2DelegateMap;// Should be synced with id2ObjectMap 
													// all the time.
	private final Map<Pair<Pair<Object,Class<?>>,FloodlightModuleRunnable>, Long> object2IdMap; // Should be synced
																// with id2ObjectMap all the time.
	private final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with KernelDeputy
	
	private long idBase;
	
	protected static Logger logger = LoggerFactory
			.getLogger(DelegateSanitizer.class);
	
	public DelegateSanitizer(Map<Long, Object> idMap, QueueWriter<ApiRequest> qw) {
		this.id2ObjectMap = idMap;
		this.apiRequestQueueWriter = qw;
		this.id2DelegateMap = new HashMap<Long, Object>();
		this.object2IdMap = new HashMap<Pair<Pair<Object, Class<?>>, FloodlightModuleRunnable>, Long>();
	}
	
	/**
	 * Caller has to ensure no conflict.
	 * @param obj
	 * @param app
	 * @return
	 */
	private Long insertObject(long id, Object obj, Class<?> clazz, Object delegate, FloodlightModuleRunnable app) {
		this.id2ObjectMap.put(id, obj);
		this.id2DelegateMap.put(id, delegate);
		this.object2IdMap.put(new Pair< Pair<Object, Class<?>>, FloodlightModuleRunnable>(
				new Pair<Object, Class<?>>(obj, clazz), app), id);
		return id;
	}
	
	private Long getIdWithObject(Object obj, Class<?> clazz, FloodlightModuleRunnable app) {
		return this.object2IdMap.get(new Pair<Pair<Object, Class<?>>, FloodlightModuleRunnable>(
				new Pair<Object, Class<?>>(obj, clazz), app));
	}
	
	private Object getObject(Long id) {
		return this.id2ObjectMap.get(id);
	}
	
	/**
	 * Look up delegate with id
	 * @param id
	 * @return
	 */
	private Object getDelegate(Long id) {
		return this.id2DelegateMap.get(id);
	}

	private FloodlightProviderDelegate getFloodlightProviderDelegate(
			IFloodlightProviderService iprovider, FloodlightModuleRunnable app) {
		FloodlightProviderDelegate delegate;
		
		if (iprovider instanceof FloodlightProviderDelegate) {
			iprovider = (IFloodlightProviderService) this.getObject(
					((FloodlightProviderDelegate) iprovider).getDelegateId());
		} else if (!(iprovider instanceof Controller))
			return null;

		Long id = getIdWithObject(iprovider, IFloodlightProviderService.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new FloodlightProviderDelegate(
					id, app, this.apiRequestQueueWriter);
			this.insertObject(id, iprovider, IFloodlightProviderService.class, delegate, app);
		} else {
			// hit
			delegate = (FloodlightProviderDelegate) this.getDelegate(id);
		}
		
		return delegate;
	}

	private IFloodlightService getStorageSourceDelegate(
			IStorageSourceService s, FloodlightModuleRunnable app) {
		StorageSourceDelegate delegate;
		
		if (s instanceof StorageSourceDelegate) {
			s = (StorageSourceDelegate) this.getObject(
					((StorageSourceDelegate) s).getDelegateId());
		} else if (!(s instanceof AbstractStorageSource))
			return null;
		
		Long id = getIdWithObject(s, IStorageSourceService.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new StorageSourceDelegate(
					id, app, this.apiRequestQueueWriter);
			this.insertObject(id, s, IStorageSourceService.class, delegate, app);
		} else {
			// hit
			delegate = (StorageSourceDelegate) this.getDelegate(id);
		}
		
		return delegate;
	}

	private IFloodlightService getDeviceDelegate(IDeviceService s,
			FloodlightModuleRunnable app) {
		DeviceDelegate delegate;
		
		if (s instanceof DeviceDelegate) {
			s = (DeviceDelegate) this.getObject(((DeviceDelegate)s).getDelegateId());
		} else if (!(s instanceof DeviceManagerImpl)) {
			return null;
		}
		
		Long id = getIdWithObject(s, IDeviceService.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new DeviceDelegate(
					id, app, this.apiRequestQueueWriter);
			this.insertObject(id, s, IDeviceService.class, delegate, app);
		} else {
			// hit
			delegate = (DeviceDelegate) this.getDelegate(id);
		}
		return delegate;
	}

	private IFloodlightService getRoutingDelegate(IRoutingService s,
			FloodlightModuleRunnable app) {
		RoutingDelegate delegate;
		
		if (s instanceof RoutingDelegate) {
			s = (RoutingDelegate) this.getObject(((RoutingDelegate)s).getDelegateId());
		} else if (!(s instanceof TopologyManager)) {
			return null;
		}
		
		Long id = getIdWithObject(s, IRoutingService.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new RoutingDelegate(
					id, app, this.apiRequestQueueWriter);
			this.insertObject(id, s, IRoutingService.class, delegate, app);
		} else {
			// hit
			delegate = (RoutingDelegate) this.getDelegate(id);
		}
		return delegate;
	}

	private IFloodlightService getTopologyDelegate(ITopologyService s,
			FloodlightModuleRunnable app) {
		TopologyDelegate delegate;
		
		if (s instanceof TopologyDelegate) {
			s = (TopologyDelegate) this.getObject(((TopologyDelegate)s).getDelegateId());
		} else if (!(s instanceof TopologyManager)) {
			return null;
		}
		
		Long id = getIdWithObject(s, ITopologyService.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new TopologyDelegate(
					id, app, this.apiRequestQueueWriter);
			this.insertObject(id, s, ITopologyService.class, delegate, app);
		} else {
			// hit
			delegate = (TopologyDelegate) this.getDelegate(id);
		}
		return delegate;
	}

	public FloodlightModuleContext getFloodlightModuleContextDelegate(
			FloodlightModuleContext cntx, FloodlightModuleRunnable app) {
		FloodlightModuleContext ret = new FloodlightModuleContext();

		Collection<Class<? extends IFloodlightService>> servs = app
				.getModuleDependencies();
		for (Class<? extends IFloodlightService> s : servs) {
			ret.addService(s, this.sanitize(s, cntx.getServiceImpl(s), app));
		}

		return ret;
	}

	public IFloodlightService sanitize(Class<? extends IFloodlightService> c,
			IFloodlightService s, FloodlightModuleRunnable app) {
		if (c.equals(IFloodlightProviderService.class)) {
			return this.getFloodlightProviderDelegate(
					(IFloodlightProviderService) s, app);
		} 
		else if (c.equals(IStorageSourceService.class)) {
			return this.getStorageSourceDelegate(
					(IStorageSourceService) s, app);
		}
		else if (c.equals(IDeviceService.class)) {
			return this.getDeviceDelegate((IDeviceService) s, app);
		}
		else if (c.equals(IRoutingService.class)) {
			return this.getRoutingDelegate((IRoutingService) s, app);
		}
		else if (c.equals(ITopologyService.class)) {
			return this.getTopologyDelegate((ITopologyService) s, app);
		}
		else if (c.equals(ICounterStoreService.class)) {
			// Pass through CounterStoreService 
			return s;
		}
		else if (c.equals(IRestApiService.class)) {
			// Pass through REST service for now
			// Monitor REST resources in the future
			return s;
		}
		else {
			logger.debug("Service {} is not supported yet.", s);
			return null;
		}
	}

	public IOFSwitch getOFSwitchDelegate(IOFSwitch sw,
			FloodlightModuleRunnable app) {
		if (sw instanceof OFSwitchDelegate) {
			sw = (IOFSwitch) this.getObject(((OFSwitchDelegate) sw)
					.getId());
		} else if (!(sw instanceof OFSwitchImpl))
			return null;

		OFSwitchDelegate delegate;
		Long id = getIdWithObject(sw, IOFSwitch.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new OFSwitchDelegate(id, app,
					this.apiRequestQueueWriter, sw.getId());
			this.insertObject(id, sw, IOFSwitch.class, delegate, app);
		} else {
			// hit
			delegate = (OFSwitchDelegate) this.getDelegate(id);
		}
		
		return delegate;
	}

	public IDevice getDeviceEntityDelegate(IDevice device,
			FloodlightModuleRunnable app) {
		if (device instanceof DeviceEntityDelegate) {
			device = (IDevice) this.getObject(((DeviceEntityDelegate) device)
					.getDelegateId());
		} else if (!(device instanceof Device))
			return null;

		DeviceEntityDelegate delegate;
		Long id = getIdWithObject(device, IDevice.class, app);
		if (id==null) {
			// no hit
			id = idBase++;
			delegate = new DeviceEntityDelegate(id, app,
					this.apiRequestQueueWriter, device);
			this.insertObject(id, device, IDevice.class, delegate, app);
		} else {
			// hit
			delegate = (DeviceEntityDelegate) this.getDelegate(id);
		}
		
		return delegate;
	}

	public OFMessage sanitizeOFMessage(OFMessage msg,
			FloodlightModuleRunnable app) {
		// TODO Sanitize msg according to policy
		return msg;
	}

	public FloodlightContext sanitizeFloodlightContext(FloodlightContext cntx,
			FloodlightModuleRunnable app) {
		// TODO This one seems hard to deal with. There's no easy way to determine 
		// what sensitive info is in it.
		return cntx;
	}

}
