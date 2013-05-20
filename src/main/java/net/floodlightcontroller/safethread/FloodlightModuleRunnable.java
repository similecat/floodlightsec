package net.floodlightcontroller.safethread;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.floodlightcontroller.core.IListener.Command;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.devicemanager.IDeviceListener;
import net.floodlightcontroller.safethread.message.DeviceEvent;
import net.floodlightcontroller.safethread.message.OFEvent;
import net.floodlightcontroller.safethread.message.OFEventResponse;
import net.floodlightcontroller.safethread.message.OFMessageEvent;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;


/**
 * FloodlightModuleRunnable mainly runs in app space except the constructor.
 * 
 * This is the class for the sub-coordinated thread model. The AppThread is the
 * bed where the module is embedded. However, for the module, this AppThread
 * should be transparent.
 * 
 * The AppThread will maintain a list of proxy service implementation and the
 * module is referencing them. However, it can referencing the kernel space
 * components.
 * 
 * @author shichao, Xitao Wen
 * 
 */
public abstract class FloodlightModuleRunnable implements Runnable, IFloodlightModule {
	public static final int NTHREAD = 1;

	protected static Logger logger = LoggerFactory
			.getLogger(FloodlightModuleRunnable.class);
	
	//private final IFloodlightModule app; // equals "this"
	private FloodlightModuleContext moduleContextDelegate;
	
	private QueueReader<OFEvent> eventQueueReader; // Event (or listener or callback) queue	
	public QueueWriter<OFEvent> eventQueueWriter;
	
	private IOFMessageListener messageListener;
	private IDeviceListener deviceListener;
	private Object initAndStartUpMonitor;
	private Object initLock;

	/**
	 * (1) Every AppThread will have a map of proxy service implementation in
	 * the AppThread space (user space) which will delegate the module for the
	 * API calls related to this service. On the contrary, the real service
	 * implementation will lie in the SecurityThread (kernel space). The proxy
	 * service implementation will do nothing else but to pass the call to the
	 * real implemenation through the queue we define.
	 * 
	 * (2) There is no need to change the module part except for the init()
	 * method. We will give a "illusion context" to the module making him
	 * believe that he is still referencing those real service implementation.
	 * But actually he is simply referencing those proxy service implementation.
	 * 
	 * 
	 * @param service
	 *            the type of service implemented
	 * @param impl
	 *            the proxy service implementation
	 * 
	 * @return The boolean value indicating whether the addition is successful
	 *         or not. The addition will fail if the proxy service
	 *         implementation providing that service is already in use
	 * 
	 */

	public void initInternal(FloodlightModuleContext cntx, DelegateSanitizer sanitizer, Object monitor, Object initLock) {
		//this.app = module;
		this.initAndStartUpMonitor = monitor;
		this.initLock = initLock;
		this.moduleContextDelegate = new FloodlightModuleContext();
		
		Collection<Class<? extends IFloodlightService>> dependences = this.getModuleDependencies();
		for(Class<? extends IFloodlightService> c : dependences) {
			IFloodlightService s = cntx.getServiceImpl(c);
			
			// Provide app with sanitized services			
			IFloodlightService ss = sanitizer.sanitize(c, s, this);
			moduleContextDelegate.addService(c, ss);
		}
		
		// Init event queue
		Object eventMonitor = new Object();
		BlockingQueue<OFEvent> eventQueue = new ArrayBlockingQueue<OFEvent>(QueueReader.QUEUE_SIZE);
		eventQueueWriter = new QueueWriter<OFEvent>(eventMonitor, eventQueue);
		eventQueueReader = new QueueReader<OFEvent>(eventMonitor, eventQueue);
	}

	/**
	 * Method for initialize the module with your crafted context. Make sure
	 * that it is called after setting the module
	 */
	private void initEx() {
		try {
			this.init(moduleContextDelegate);
		} catch (FloodlightModuleException e) {
			logger.debug("FloodlightModuleException: {}", e);
		}
	}

	/**
	 * Start up a module
	 */
	private void startUpEx() {
		this.startUp(moduleContextDelegate);
	}
	
	public void setMessageListener(IOFMessageListener l) {
		this.messageListener = l;
	}
	
	public void setDeviceListener(IDeviceListener l) {
		this.deviceListener = l;
	}

	@Override
	public void run() {
		OFEvent event;
		
		// initialize the module internal data
		synchronized (initAndStartUpMonitor) {
			try {
				synchronized (initLock) {
					initLock.notifyAll();
				}
				initAndStartUpMonitor.wait();
			} catch (InterruptedException e) {
				logger.debug("InterruptedException: {}", e);
			}
		}
		initEx();

		// start up app external dependences
		synchronized (initAndStartUpMonitor) {
			try {
				synchronized (initLock) {
					initLock.notifyAll();
				}
				initAndStartUpMonitor.wait();
			} catch (InterruptedException e) {
				logger.debug("InterruptedException: {}", e);
			}
		}
		startUpEx();

		while (true) {
			//eventQueueReader.waitsNoTimeout();
			event = eventQueueReader.pollingRead();
//			event = eventQueueReader.pollingRead();

			while(event!=null) {
				// Dispatch and execute
				Command cmd = dispatchEvent(event);
				
				QueueWriter<OFEventResponse> writer = event.getResponseWriter();
				if (writer!=null) {
					writer.write(new OFEventResponse(cmd));
					//writer.notifies();
				}

				//logger.debug("App queue length: {}", eventQueueReader.queue.size());
				event = eventQueueReader.pollingRead();
			}
		}
	}

	private Command dispatchEvent(
			OFEvent event) {
		Command cmd;
		
		if (event instanceof OFMessageEvent) {
			IOFMessageListener real = MessageListenerDelegate.getRealListener(messageListener);
			cmd = real.receive(((OFMessageEvent) event).getOFSwitch(),
					((OFMessageEvent) event).getOFMessage(),
					((OFMessageEvent) event).getFloodlightContext());
		}
		else if (event instanceof DeviceEvent) {
			IDeviceListener real = DeviceListenerDelegate
					.getRealListener(deviceListener);
			switch (((DeviceEvent) event).getType()) {
			case ADDED:
				real.deviceAdded(((DeviceEvent) event).getDevice());
			case REMOVED:
				real.deviceRemoved(((DeviceEvent) event).getDevice());
			case MOVED:
				real.deviceMoved(((DeviceEvent) event).getDevice());
			case IPV4_ADDR_CHANGED:
				real.deviceIPV4AddrChanged(((DeviceEvent) event).getDevice());
			case VLAN_CHANGED:
				real.deviceVlanChanged(((DeviceEvent) event).getDevice());
			}
			cmd = Command.CONTINUE;
		}
		else {
			// TODO: Add other cases
			// Should not fall into here...
			cmd = Command.CONTINUE;
		}
		return cmd;
	}
}
