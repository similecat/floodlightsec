package chao.floodlightcontroller.safethread;

import java.lang.reflect.Method;
import java.util.ArrayList;
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
import net.floodlightcontroller.core.module.IFloodlightModule;

/**
 * This is a proxy FloodlightProvider in the user space. Note that not every API
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
public class ProxyFloodlightProvider extends ProxyBase implements
		IFloodlightProviderService, IOFMessageListener {

	// Some kind of listener lying behind the wall. Most likely that is a module.
	// A map representing the catogery of listeners you are proxy of!
	private Map<OFType, List<IOFMessageListener>> map;
	
	public ProxyFloodlightProvider(FloodlightModuleRunnable thread){
		super(thread);
	}
	
	/**
	 * Pass the interface method reflector as a argument.
	 */
	@Override
	public void addOFMessageListener(OFType type, IOFMessageListener listener) {
		
		if(map.get(type) == null){
			map.put(type, new ArrayList<IOFMessageListener>());
		}
		map.get(type).add(listener);
		
		Method method = null;
		try {
			method = IFloodlightProviderService.class.getMethod(
					"addOFMessageListener", OFType.class,
					IOFMessageListener.class);
		} catch (SecurityException e) {
			e.printStackTrace();
			return;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return;
		}

		List<Object> args = new ArrayList<Object>();
		args.add(type);
		// The Proxy add itself to the listener and do censorship on the module
		// function of receive()
		args.add(this);
		ServiceImplApiRequest req = ServiceImplApiRequest.create(pThread,
				IFloodlightProviderService.class, method, args);

		pThread.writeRequestToQueue(req);
	}

	@Override
	public void removeOFMessageListener(OFType type, IOFMessageListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public Map<OFType, List<IOFMessageListener>> getListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, IOFSwitch> getSwitches() {
		
		Method method = null;
		try {
			method = IFloodlightProviderService.class.getMethod(
					"getSwitches");
		} catch (SecurityException e) {
			e.printStackTrace();
			return null;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return null;
		}
		List<Object> args = new ArrayList<Object>();
		ServiceImplApiRequest req = ServiceImplApiRequest.create(pThread,
				IFloodlightProviderService.class, method, args);

		pThread.writeRequestToQueue(req);
		
		// waiting mechanism 
		
		ApiResponse res = pThread.readResponseFromQueue();
		Map<Long, IOFSwitch> originMap = (Map<Long,IOFSwitch>) res.getPayload();
		Map<Long, IOFSwitch> imgMap = new HashMap<Long, IOFSwitch>();
		for(long id: originMap.keySet()){
			imgMap.put(id, new ProxySwitch(id, pThread));
		}
		return imgMap;
	}

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
	public BasicFactory getOFMessageFactory() {
		// TODO Auto-generated method stub
		return null;
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
	public String getName() {
		// TODO Auto-generated method stub
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
	 * This function will convert the real switch (OFSwitchImpl) to ProxySwitch
	 */
	@Override
	public net.floodlightcontroller.core.IListener.Command receive(
			IOFSwitch sw, OFMessage msg, FloodlightContext cntx) {
		IOFSwitch psw = ProxySwitch.image(sw, pThread);
		// TODO Future work, censor on msg and cntx
		
		// Dispatch them
		for(IOFMessageListener listener:map.get(msg.getType())){
			listener.receive(psw, msg, cntx);
		}
		return null;
	}

}
