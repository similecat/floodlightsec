package net.floodlightcontroller.safethread;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

import net.floodlightcontroller.devicemanager.IDevice;
import net.floodlightcontroller.devicemanager.IDeviceListener;
import net.floodlightcontroller.devicemanager.IDeviceService;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

public class DeviceDelegate extends DelegateBase implements IDeviceService {

	public DeviceDelegate(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> kw) {
		super(id, app, kw);
	}

	@Override
	public void addListener(IDeviceListener listener) {
		apiRequestAsync("addListener", Arrays.asList((Object) listener));
	}
	
//////////////////////////////////////////////////
// Interface methods that haven't been supported
//////////////////////////////////////////////////
	
	@Override
	public IDevice getDevice(Long deviceKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDevice findDevice(long macAddress, Short vlan, Integer ipv4Address,
			Long switchDPID, Integer switchPort)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDevice findDestDevice(IDevice source, long macAddress, Short vlan,
			Integer ipv4Address) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends IDevice> getAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addIndex(boolean perClass, EnumSet<DeviceField> keyFields) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<? extends IDevice> queryDevices(Long macAddress,
			Short vlan, Integer ipv4Address, Long switchDPID, Integer switchPort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<? extends IDevice> queryClassDevices(IDevice reference,
			Long macAddress, Short vlan, Integer ipv4Address, Long switchDPID,
			Integer switchPort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addSuppressAPs(long swId, short port) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSuppressAPs(long swId, short port) {
		// TODO Auto-generated method stub

	}

}
