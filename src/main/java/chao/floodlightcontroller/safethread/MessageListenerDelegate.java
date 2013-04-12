package chao.floodlightcontroller.safethread;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFType;

import chao.floodlightcontroller.safethread.message.OFEvent;
import chao.floodlightcontroller.safethread.message.OFEventResponse;
import chao.floodlightcontroller.safethread.message.OFMessageEvent;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;

/**
 * MessageListenerDelegate is a listen placeholder on behalf of the app. It runs
 * in controller space except the constructor function.
 * 
 * @author Xitao Wen
 * 
 */
public class MessageListenerDelegate implements IOFMessageListener {
	private final IOFMessageListener realListener;
	private final FloodlightModuleRunnable app;

	// TODO: Implement sanitizer
	// private DelegateSanitizer sanitizer;

	MessageListenerDelegate(IOFMessageListener l, IFloodlightModule app) {
		this.realListener = l;
		if (app instanceof FloodlightModuleRunnable) {
			this.app = (FloodlightModuleRunnable) app;
		} else {
			this.app = null;
		}
	}

	// TODO: Implement sanitizer
	// public void setSanitizer(DelegateSanitizer s) {
	// sanitizer = s;
	// }

	@Override
	public String getName() {
		return realListener.getName();
	}

	@Override
	public boolean isCallbackOrderingPrereq(OFType type, String name) {
		return realListener.isCallbackOrderingPrereq(type, name);
	}

	@Override
	public boolean isCallbackOrderingPostreq(OFType type, String name) {
		return realListener.isCallbackOrderingPostreq(type, name);
	}

	@Override
	public net.floodlightcontroller.core.IListener.Command receive(
			IOFSwitch sw, OFMessage msg, FloodlightContext cntx) {
		// TODO: Permission check

		// TODO: Sanitize parameters

		// Notify app through inter-thread communication
		Object retMonitor = new Object();
		Queue<OFEventResponse> retQueue = new ConcurrentLinkedQueue<OFEventResponse>();
		QueueWriter<OFEventResponse> retWriter = new QueueWriter<OFEventResponse>(
				retMonitor, retQueue);
		QueueReader<OFEventResponse> retReader = new QueueReader<OFEventResponse>(
				retMonitor, retQueue);
		OFEvent t = new OFMessageEvent(retWriter, app, msg, sw, cntx);

		app.eventQueueWriter.write(t);
		app.eventQueueWriter.notifies();

		// Wait return value
		retReader.waits();
		OFEventResponse response = retReader.read();

		return response.command;
	}

}