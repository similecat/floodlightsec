package net.floodlightcontroller.safethread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFType;
import org.openflow.protocol.factory.BasicFactory;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IHAListener;
import net.floodlightcontroller.core.IInfoProvider;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.IOFSwitchListener;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.util.QueueWriter;

/**
 * This is a proxy FloodlightProvider in the app space. Note that not every API
 * will be needed to implement. We only need to implement those called from the
 * module and simply return for the rest of API used internally. This works the
 * same for the other Proxy service implementations.
 * 
 * A unique thing about the FloodlightProvider is that it implements
 * IOFMessageListener. It will intercept the addOFMessageListener API call from
 * the module and change the listener to itself. After receiving the message
 * from the kernel, with true IOFSwitch reference. It will do censorship and
 * play that message to module while replace the real switch reference with an
 * image. The switch image is nothing but a switch with id.
 * 
 * @author shichao
 * 
 */
public class FloodlightProviderDelegate extends DelegateBase implements
		IFloodlightProviderService {
	
	protected BasicFactory factory;

	// Some kind of listener lying behind the wall. Most likely that is a
	// module.
	// A map representing the catogery of listeners you are proxy of!

	public FloodlightProviderDelegate(long id, FloodlightModuleRunnable app,
			QueueWriter<ApiRequest> qw) {
		super(id, app, qw);
		factory = new BasicFactory();
	}

	/**
	 * Pass the interface method reflector as a argument.
	 * 
	 * @param type
	 *            Type of OFMessage to listen to
	 * @param listener
	 *            , the real listener, the module or a component of the module
	 */
	@Override
	public void addOFMessageListener(OFType type, IOFMessageListener listener) {
//		apiRequestAsync("addOFMessageListener", Arrays.asList(type,this.app));
		IOFMessageListener delegate = new MessageListenerDelegate(listener, app);
		app.setMessageListener(delegate);
		apiRequestAsync("addOFMessageListener",
				Arrays.asList(type, delegate));
	}

	@Override
	public void removeOFMessageListener(OFType type, IOFMessageListener listener) {
		apiRequestAsync(
				"removeOFMessageListener",
				Arrays.asList(type,
						MessageListenerDelegate.getListenerDelegate(listener)));
	}


	@SuppressWarnings("unchecked")
	@Override
	public Map<Long, IOFSwitch> getSwitches() {
		Object r = apiRequestSync("getSwitches", Arrays.asList());
		if (r == null || !(r instanceof Map<?, ?>)) {
			return new HashMap<Long, IOFSwitch>();
		}
		else {
			return (Map<Long, IOFSwitch>) r;
		}
	}
	
	@Override
	public BasicFactory getOFMessageFactory() {
		/**
		 * Now only do the original registration
		 */
		return factory;
	}
	
//////////////////////////////////////////////////
//Interface methods that haven't been supported
//////////////////////////////////////////////////

	@Override
	public Role getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getControllerNodeIPs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getControllerId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRole(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addOFSwitchListener(IOFSwitchListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeOFSwitchListener(IOFSwitchListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addHAListener(IHAListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeHAListener(IHAListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean injectOfMessage(IOFSwitch sw, OFMessage msg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean injectOfMessage(IOFSwitch sw, OFMessage msg,
			FloodlightContext bContext) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void handleOutgoingMessage(IOFSwitch sw, OFMessage m,
			FloodlightContext bc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addInfoProvider(String type, IInfoProvider provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeInfoProvider(String type, IInfoProvider provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> getControllerInfo(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSystemStartTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAlwaysClearFlowsOnSwAdd(boolean value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<OFType, List<IOFMessageListener>> getListeners() {
		// TODO Auto-generated method stub
		return null;
	}

}
