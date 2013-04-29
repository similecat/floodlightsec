package net.floodlightcontroller.safethread;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.safethread.message.OFEvent;
import net.floodlightcontroller.safethread.message.OFEventResponse;
import net.floodlightcontroller.safethread.message.OFMessageEvent;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;

/**
 * MessageListenerDelegate is a listen placeholder on behalf of the app. It runs
 * in controller space except the constructor function.
 * 
 * @author Xitao Wen
 * 
 */
public class MessageListenerDelegate extends DelegateBase implements IOFMessageListener {	
	private static final Map<IOFMessageListener, IOFMessageListener> real2delegateMap = 
			new HashMap<IOFMessageListener, IOFMessageListener>();	
	private static final Map<IOFMessageListener, IOFMessageListener> delegate2realMap = 
			new HashMap<IOFMessageListener, IOFMessageListener>();

	private final IOFMessageListener realListener;
	private final FloodlightModuleRunnable app;

	// KernelDeputy installs the sanitizer before sends to controller 
	private DelegateSanitizer sanitizer;
	
	protected static Logger logger = LoggerFactory
			.getLogger(MessageListenerDelegate.class);

	// Debug /////////////////////////
//	private int count = 0;
	
	// Only visible within safethread package
	MessageListenerDelegate(long id, IOFMessageListener l, FloodlightModuleRunnable app) {
		super(id,app,null);
		this.realListener = l;
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
	public static IOFMessageListener getRealListener(IOFMessageListener delegate) {
		return delegate2realMap.get(delegate);
	}

	public static IOFMessageListener getListenerDelegate(IOFMessageListener real) {
		return real2delegateMap.get(real);
	}

	// Implement sanitizer
	public void setSanitizer(DelegateSanitizer s) {
		sanitizer = s;
	}

	@Override
	public String getName() {
		// Pass-through for performance. It may have code privilege escalation
		// issue.
		return realListener.getName();
	}

	@Override
	public boolean isCallbackOrderingPrereq(OFType type, String name) {
		// Pass-through for performance
		return realListener.isCallbackOrderingPrereq(type, name);
	}

	@Override
	public boolean isCallbackOrderingPostreq(OFType type, String name) {
		// Pass-through for performance
		return realListener.isCallbackOrderingPostreq(type, name);
	}

	@Override
	public net.floodlightcontroller.core.IListener.Command receive(
			IOFSwitch sw, OFMessage msg, FloodlightContext cntx) {
		// TODO: Permission check
		
		
		// Debug //////////////////////////
//		if (sw.getId()==7) {
//			count++;
//			if (count % 2 == 1) {
//				count = count;
//			}				
//		}

		// Sanitize parameters
		IOFSwitch swApp = sanitizer.getOFSwitchDelegate(sw, app);
		OFMessage msgApp = sanitizer.sanitizeOFMessage(msg, app);
		FloodlightContext cntxApp = sanitizer.sanitizeFloodlightContext(cntx, app);

		// Notify app through inter-thread communication
		Object retMonitor = new Object();
		Queue<OFEventResponse> retQueue = new ConcurrentLinkedQueue<OFEventResponse>();
		QueueWriter<OFEventResponse> retWriter = new QueueWriter<OFEventResponse>(
				retMonitor, retQueue);
		QueueReader<OFEventResponse> retReader = new QueueReader<OFEventResponse>(
				retMonitor, retQueue);
		OFEvent t = new OFMessageEvent(retWriter, app, msgApp, swApp, cntxApp);

		app.eventQueueWriter.write(t);
		app.eventQueueWriter.notifies();

		// Wait return value
		//logger.debug("Wait reader at receive({})", msg);
		retReader.waitsNoTimeout();
		OFEventResponse response = retReader.read();
		//logger.debug("Wait return");
//		OFEventResponse response = retReader.pollingRead();

		if (response == null) {
			return Command.CONTINUE;
		} else {
			return response.command;
		}
	}

}