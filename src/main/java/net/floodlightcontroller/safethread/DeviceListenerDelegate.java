package net.floodlightcontroller.safethread;

import java.util.HashMap;
import java.util.Map;

import net.floodlightcontroller.devicemanager.IDevice;
import net.floodlightcontroller.devicemanager.IDeviceListener;
import net.floodlightcontroller.safethread.message.DeviceEvent;
import net.floodlightcontroller.safethread.message.OFEvent;

public class DeviceListenerDelegate extends DelegateBase implements
		IDeviceListener {
	private static final Map<IDeviceListener, IDeviceListener> real2delegateMap = 
			new HashMap<IDeviceListener, IDeviceListener>();
	private static final Map<IDeviceListener, IDeviceListener> delegate2realMap = 
			new HashMap<IDeviceListener, IDeviceListener>();

	// private final IDeviceListener realListener; // not needed here?
	private final FloodlightModuleRunnable app;

	// KernelDeputy installs the sanitizer before sends to controller 
	private DelegateSanitizer sanitizer;

	// Only visible within safethread package
	DeviceListenerDelegate(long id, IDeviceListener l, FloodlightModuleRunnable app) {
		super(id,app,null);
		if (app instanceof FloodlightModuleRunnable) {
			this.app = (FloodlightModuleRunnable) app;
		} else {
			// Invalid listener
			this.app = null;
		}
		
		real2delegateMap.put(l, this);
		delegate2realMap.put(this, l);
	}
	
	/**
	 * Class method to get the real listener from the listener delegate.
	 * @param delegate
	 * @return
	 */
	public static IDeviceListener getRealListener(IDeviceListener delegate) {
		return delegate2realMap.get(delegate);
	}

	public static IDeviceListener getListenerDelegate(IDeviceListener real) {
		return real2delegateMap.get(real);
	}

	// Implement sanitizer
	public void setSanitizer(DelegateSanitizer s) {
		sanitizer = s;
	}

	@Override
	public void deviceAdded(IDevice device) {
		// TODO: Permission check

		// Sanitize parameters
		IDevice deviceApp = sanitizer.getDeviceEntityDelegate(device, app);

		// Notify app through inter-thread communication
		OFEvent t = new DeviceEvent(null, app, DeviceEvent.Type.ADDED, deviceApp);

		app.eventQueueWriter.write(t);
		//app.eventQueueWriter.notifies();

		// No return value
	}

	@Override
	public void deviceRemoved(IDevice device) {
		// TODO: Permission check

		// Sanitize parameters
		IDevice deviceApp = sanitizer.getDeviceEntityDelegate(device, app);

		// Notify app through inter-thread communication
		OFEvent t = new DeviceEvent(null, app, DeviceEvent.Type.REMOVED, deviceApp);

		app.eventQueueWriter.write(t);
		//app.eventQueueWriter.notifies();

		// No return value
	}

	@Override
	public void deviceMoved(IDevice device) {
		// TODO: Permission check

		// Sanitize parameters
		IDevice deviceApp = sanitizer.getDeviceEntityDelegate(device, app);

		// Notify app through inter-thread communication
		OFEvent t = new DeviceEvent(null, app, DeviceEvent.Type.MOVED, deviceApp);

		app.eventQueueWriter.write(t);
		//app.eventQueueWriter.notifies();

		// No return value
	}

	@Override
	public void deviceIPV4AddrChanged(IDevice device) {
		// TODO: Permission check

		// Sanitize parameters
		IDevice deviceApp = sanitizer.getDeviceEntityDelegate(device, app);

		// Notify app through inter-thread communication
		OFEvent t = new DeviceEvent(null, app, DeviceEvent.Type.IPV4_ADDR_CHANGED, deviceApp);

		app.eventQueueWriter.write(t);
		//app.eventQueueWriter.notifies();

		// No return value
	}

	@Override
	public void deviceVlanChanged(IDevice device) {
		// TODO: Permission check

		// Sanitize parameters
		IDevice deviceApp = sanitizer.getDeviceEntityDelegate(device, app);

		// Notify app through inter-thread communication
		OFEvent t = new DeviceEvent(null, app, DeviceEvent.Type.VLAN_CHANGED, deviceApp);

		app.eventQueueWriter.write(t);
		//app.eventQueueWriter.notifies();

		// No return value
	}

}
