package net.floodlightcontroller.safethread.permissionmanager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.FloodlightModuleLoader;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.safethread.permissionmanager.FloodlightPermission.PermissionType;
import net.floodlightcontroller.util.Pair;

public class PermissionStorage implements IPermissionStorageService, IFloodlightModule {
	protected static final String[] PERMISSION_STRINGS = 
		{"READ_TOPOLOGY", 
		"READ_ALL_FLOW", 
		"READ_STAT", 
		"READ_PKT_IN_PAYLOAD", 
		"PKT_IN_EVENT", 
		"FLOW_REMOVED_EVENT", 
		"ERROR_EVENT", 
		"TOPOLOGY_EVENT", 
		"FLOW_RECONCILE_EVENT", 
		"FLOW_MOD_ROUTE", 
		"FLOW_MOD_DROP", 
		"FLOW_MOD_MODIFY_HDR", 
		"MODIFY_ALL_FLOWS", 
		"SET_FLOW_PRIORITY", 
		"SET_DEVICE_CONFIG", 
		"SEND_PKT_OUT", 
		"SEND_BARRIER", 
		"NETWORK_ACCESS", 
		"FILE_SYSTEM_ACCESS", 
		"PROCESS_RUNTIME_ACCESS"};
    protected static Logger logger = LoggerFactory.getLogger(PermissionStorage.class);
    
    protected final Set<Pair<IFloodlightModule, PermissionType>> permSet;
    protected final Map<String, PermissionType> name2PermMap;
    protected final Map<String, IFloodlightModule> name2ModuleMap;    
    protected final Map<Thread, IFloodlightModule> thread2ModuleMap; // An app may have multiple threads
    protected final Set<Thread> appThreadSet; // Shared with AppSecurityManager
    
    public PermissionStorage() {
    	permSet = new HashSet<Pair<IFloodlightModule, PermissionType>>();
    	name2PermMap = new HashMap<String, PermissionType>();
    	name2ModuleMap = new HashMap<String, IFloodlightModule>();
    	thread2ModuleMap = new HashMap<Thread, IFloodlightModule>();
    	appThreadSet = new HashSet<Thread>();
    	
    	for(int i=0; i<PERMISSION_STRINGS.length; i++) {
    		name2PermMap.put(PERMISSION_STRINGS[i], PermissionType.values()[i]);
    	}
    }
    
	protected boolean parsePermConfig() {
		// Load properties
		Properties prop = new Properties();	
        InputStream is = this.getClass().getClassLoader().
                                getResourceAsStream(FloodlightModuleLoader.COMPILED_CONF_FILE);
        try {
            prop.load(is);
        } catch (IOException e) {
            logger.error("Could not load permission policy from default properties file", e);
            return false;
        }
        
        // Parse module list
		String moduleString = prop.getProperty(FloodlightModuleLoader.FLOODLIGHT_APPS_KEY)
			.replace("\\s", "");
		Collection<String> moduleArray = new ArrayList<String>();
		moduleArray.addAll(Arrays.asList(moduleString.split(",")));
		
		// Parse and store permission for each module
		for(String appStr : moduleArray)
		{
			String privString = prop.getProperty(appStr+".privileges","").replaceAll("\\s", "");
			if( !("".equals(privString)) )
			{
				Collection<String> privArray = new ArrayList<String>();
				privArray.addAll(Arrays.asList(privString.split(",")));
				
				for(String permStr : privArray)
				{
					IFloodlightModule app = name2ModuleMap.get(appStr);
					PermissionType perm = name2PermMap.get(permStr);
					addPerm(app, perm);
				}
			}
		}				
		return true;
	}
	
	protected void addPerm(IFloodlightModule app, PermissionType perm) {
		this.permSet.add(new Pair<IFloodlightModule, PermissionType>(app, perm));
	}
	
	Set<Thread> getThreadSet() {
		return appThreadSet;
	}
	
	public void checkPermission(PermissionType perm,
			Thread app) throws SecurityException {
		IFloodlightModule appMod = thread2ModuleMap.get(app);
		if (permSet.contains(new Pair<IFloodlightModule, PermissionType>(
				appMod, perm))) {
			return;
		} else {
			throw new SecurityException(perm.name());
		}
	}
	
	public void setApps(String[] appNames,
			Thread[] appThreads, IFloodlightModule[] appMods) {
		for(int i=0; i<appNames.length; i++) {
			name2ModuleMap.put(appNames[i], appMods[i]);
			thread2ModuleMap.put(appThreads[i], appMods[i]);
			appThreadSet.add(appThreads[i]);
		}
		parsePermConfig();
	}
	
	public void addAppThread(Thread appThread, IFloodlightModule appMod) {
		// Add a new thread to an existing module
		// FIXME Potential memory leakage...
		thread2ModuleMap.put(appThread, appMod);
		appThreadSet.add(appThread);
	}

	@Override
	public Collection<Class<? extends IFloodlightService>> getModuleServices() {
		Collection<Class<? extends IFloodlightService>> l =
			new ArrayList<Class<? extends IFloodlightService>>();
		l.add(IPermissionStorageService.class);
		return l;
	}

	@Override
	public Map<Class<? extends IFloodlightService>, IFloodlightService> getServiceImpls() {
		Map<Class<? extends IFloodlightService>, IFloodlightService> m = 
				new HashMap<Class<? extends IFloodlightService>, IFloodlightService>();
		m.put(IPermissionStorageService.class, this);
		return m;
	}

	@Override
	public Collection<Class<? extends IFloodlightService>> getModuleDependencies() {
		// No dependency
		Collection<Class<? extends IFloodlightService>> l = 
				new ArrayList<Class<? extends IFloodlightService>>();
		return l;
	}

	@Override
	public void init(FloodlightModuleContext context)
			throws FloodlightModuleException {
		// Do nothing
	}

	@Override
	public void startUp(FloodlightModuleContext context) {
		// Do nothing		
	}
}
