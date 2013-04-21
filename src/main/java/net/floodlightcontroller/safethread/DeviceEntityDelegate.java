package net.floodlightcontroller.safethread;

import java.util.Date;

import net.floodlightcontroller.devicemanager.IDevice;
import net.floodlightcontroller.devicemanager.IEntityClass;
import net.floodlightcontroller.devicemanager.SwitchPort;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

/**
 * Wrapper class of Device. Screen out the class methods beyond IDevice
 * interface.
 * 
 * @author Xitao Wen
 * 
 */
public class DeviceEntityDelegate extends DelegateBase implements IDevice {
	IDevice real;

	DeviceEntityDelegate(long id, FloodlightModuleRunnable app,
			QueueWriter<ApiRequest> qw, IDevice real) {
		super(id, app, qw);
		this.real = real;
	}

	@Override
	public Long getDeviceKey() {
		return real.getDeviceKey();
	}

	@Override
	public long getMACAddress() {
		return real.getMACAddress();
	}

	@Override
	public String getMACAddressString() {
		return real.getMACAddressString();
	}

	@Override
	public Short[] getVlanId() {
		return real.getVlanId();
	}

	@Override
	public Integer[] getIPv4Addresses() {
		return real.getIPv4Addresses();
	}

	@Override
	public SwitchPort[] getAttachmentPoints() {
		return real.getAttachmentPoints();
	}

	@Override
	public SwitchPort[] getAttachmentPoints(boolean includeError) {
		return real.getAttachmentPoints(includeError);
	}

	@Override
	public Short[] getSwitchPortVlanIds(SwitchPort swp) {
		return real.getSwitchPortVlanIds(swp);
	}

	@Override
	public Date getLastSeen() {
		return real.getLastSeen();
	}

	@Override
	public IEntityClass getEntityClass() {
		return real.getEntityClass();
	}

}
