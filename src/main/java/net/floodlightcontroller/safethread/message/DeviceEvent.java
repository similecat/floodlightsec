package net.floodlightcontroller.safethread.message;

import net.floodlightcontroller.devicemanager.IDevice;
import net.floodlightcontroller.safethread.FloodlightModuleRunnable;
import net.floodlightcontroller.util.QueueWriter;

public class DeviceEvent extends OFEvent {
	public enum Type {ADDED, REMOVED, MOVED, IPV4_ADDR_CHANGED, VLAN_CHANGED};
	
	private final FloodlightModuleRunnable receiver;
	private final IDevice device;
	private final Type type;

	/**
	 * Constructor of DeviceListener event.
	 * @param qw
	 * @param receiver
	 * @param type
	 * @param device
	 * @author Xitao Wen
	 */
	public DeviceEvent(QueueWriter<OFEventResponse> qw,
			FloodlightModuleRunnable receiver, Type type, IDevice device) {
		super(OFEvent.Type.Device, qw);
		this.receiver = receiver;
		this.device = device;
		this.type = type;
	}

	public FloodlightModuleRunnable getEventReceiver(){
		return this.receiver;
	}
	
	public IDevice getDevice() {
		return this.device;
	}

	public Type getType() {
		return type;
	}
}
