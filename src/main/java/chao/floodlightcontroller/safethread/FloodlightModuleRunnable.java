package chao.floodlightcontroller.safethread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.deputy.KernelDeputy;
//import net.floodlightcontroller.core.deputy.KernelDeputy2;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.devicemanager.IDeviceListener;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;

import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFType;

import chao.floodlightcontroller.safethread.message.ApiRequest;
import chao.floodlightcontroller.safethread.message.ApiResponse;
import chao.floodlightcontroller.safethread.message.OFEvent;
import chao.floodlightcontroller.safethread.message.OFMessageEvent;

/**
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
public class FloodlightModuleRunnable implements Runnable, IOFMessageListener {
	private final IFloodlightModule module;
	// TODO Field to be removed
	public FloodlightModuleContext realContext;
	private final FloodlightModuleContext virtualContext;

	private Queue<OFEvent> event_queue;
	private Map<OFType, List<IOFMessageListener>> map;

	private Object inboundMonitor;
	private Object moduleMonitor;
	
	protected final QueueReader<OFEvent> eventQueueReader = null; // Event (or listener or callback) queue	
	public final QueueWriter<OFEvent> eventQueueWriter = null;

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

	public FloodlightModuleRunnable(IFloodlightModule module) {
		this.module = module;
		virtualContext = new FloodlightModuleContext();
//		for (Class<? extends IFloodlightService> clazz : module
//				.getModuleDependencies()) {
//			virtualContext.addService(clazz,
//					ProxyServiceImplFactory.instanceServiceImpl(clazz, this));
//		}
		event_queue = new ConcurrentLinkedQueue<OFEvent>();
		inboundMonitor = new Object();
		moduleMonitor = new Object();
	}

	/**
	 * Method for initialize the module with your crafted context. Make sure
	 * that it is called after setting the module
	 */
	public void initModule() {
		try {
			module.init(virtualContext);
		} catch (FloodlightModuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * A temporary method to allow the AppThread to directly refer to the kernel
	 * components
	 * 
	 * @deprecated
	 * @param realContext
	 *            real FloodlightModuleContext
	 */
	public void initModule(FloodlightModuleContext realContext) {
		this.realContext = realContext;
		initModule();
	}

	/**
	 * Start up a module
	 */
	public void startModule() {
		module.startUp(virtualContext);
	}

	/**
	 * This function is waiting on the OFMessage queue until it is not empty
	 * 
	 * @return Always return true
	 */
	private boolean waitOFEventFromQueue() {
		while (event_queue.isEmpty()) {
			synchronized (inboundMonitor) {
				try {
					inboundMonitor.wait();
				} catch (InterruptedException e) {
					System.err.println("Read OFMessage from queue interrupted");
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	/**
	 * This function will wait on the queue for a maximum of n seconds. If the
	 * queue is ready for reading by that time, return the true, else return
	 * false.
	 * 
	 * @param n
	 *            Patience Time in seconds. 0 means no timeout, same as
	 *            waitResponseFromQueue()
	 * @return True if the queue is ready for read and false if timeout
	 */
	private boolean waitOFEventFromQueue(int n) {

		if (n == 0) {
			return waitOFEventFromQueue();
		}

		long start = System.currentTimeMillis();
		while (event_queue.isEmpty()
				&& System.currentTimeMillis() - start < n * 1000) {
			synchronized (inboundMonitor) {
				try {
					inboundMonitor.wait(1000);
				} catch (InterruptedException e) {
					System.err.println("Read OFMessage from queue interrupted");
					e.printStackTrace();
				}
			}
		}
		if (!event_queue.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This blocking function will read from the OFMessage queue until
	 * successful
	 * 
	 * @return The OFMessage
	 */
	public OFEvent readOFEventFromQueue() {
		this.waitOFEventFromQueue();
		return event_queue.poll();
	}

	/**
	 * Write a OFMessage to the queue of the AppThread
	 * 
	 * @param info
	 */
	public void writeOFEventToQueue(OFEvent info) {
		event_queue.add(info);
		synchronized (inboundMonitor) {
			inboundMonitor.notifyAll();
		}
	}

	/**
	 * A dangerous method, called only from proxy service implementations
	 * 
	 * @param type
	 * @param listener
	 */
	public void addOFListener(OFType type, IOFMessageListener listener) {
		if (map.get(type) == null) {
			map.put(type, new ArrayList<IOFMessageListener>());
		}
		map.get(type).add(listener);
	}

	@Override
	public void run() {
		// initialize the module
		// initModule();

		// start up the module on the thread
		startModule();

		// if the module is an implementation of the IOFMessageListener, Run a
		// loop of listening message
		if (module instanceof IOFMessageListener || module instanceof IDeviceListener) {
			while (true) {
				OFEvent event = readOFEventFromQueue();
				if (event instanceof OFMessageEvent && module instanceof IOFMessageListener) {
					OFMessageEvent info = (OFMessageEvent) event;
					IOFSwitch sw = info.getOFSwitch();
					OFMessage ofm = info.getOFMessage();
					FloodlightContext cntx = info.getFloodlightContext();
					synchronized (moduleMonitor) {
						Command cmd = ((IOFMessageListener) module).receive(sw,
								ofm, cntx);
						//KernelDeputy2.getInstance().informCommand(cmd);
					}
				}
			}
		}
	}

	/**
	 * Register as a listener with the name from the module
	 */
	@Override
	public String getName() {
		// The name of the module
		if (module instanceof IOFMessageListener) {
			return ((IOFMessageListener) module).getName();
		}
		return null;
	}

	@Override
	public boolean isCallbackOrderingPrereq(OFType type, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCallbackOrderingPostreq(OFType type, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This receive function should never ever be called from the kernel thread
	 */
	@Override
	public net.floodlightcontroller.core.IListener.Command receive(
			IOFSwitch sw, OFMessage msg, FloodlightContext cntx) {
		// It should never be called
		System.err.println("It should never be called");
		return null;
	}

}
