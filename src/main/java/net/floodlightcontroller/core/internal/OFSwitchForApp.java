package net.floodlightcontroller.core.internal;

import java.util.ArrayList;
import java.util.List;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.deputy.KernelDeputy;

import org.openflow.protocol.OFMessage;

public class OFSwitchForApp extends OFSwitchImpl {
	
	public OFSwitchImpl mappingSW; // should be replaced by a reference number of a object mapping
	protected KernelDeputy deputy = Controller.deputy;
	
	public OFSwitchForApp(OFSwitchImpl sw) {
		super();
		mappingSW = sw;
	}
	
	@Override
	public void write(OFMessage m, FloodlightContext bc) {
		// write to kernel deputy's task queue
		List<Object> task = new ArrayList<Object>();
		task.add(this);
		task.add(m);
		task.add(bc);
		KernelDeputy.taskQueue.add(task);
		
		synchronized(KernelDeputy.monitor) {
			KernelDeputy.monitor.notifyAll();
		}
	}
	
}
