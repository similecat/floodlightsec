package net.floodlightcontroller.safethread.permissionmanager;

import java.security.Permission;
import java.util.Set;

import sun.security.util.SecurityConstants;

import net.floodlightcontroller.safethread.permissionmanager.FloodlightPermission.PermissionType;

public class AppSecurityManager extends SecurityManager {
	protected final IPermissionStorageService permStore;
	protected final Set<Thread> appThreadSet;
	
	public AppSecurityManager(PermissionStorage store) {
		super();
		this.permStore = store;
		appThreadSet = store.getThreadSet();
	}
	
	@Override
	public void checkAccess(ThreadGroup g) {
		if (g == null) {
			throw new NullPointerException("thread group can't be null");
		}		
		// Removed the rootGroup constraint
		checkPermission(SecurityConstants.MODIFY_THREADGROUP_PERMISSION);
	}
	
	@Override
	public void checkAccess(Thread t) {
		if (t == null) {
			throw new NullPointerException("thread can't be null");
		}
		// Removed the rootGroup constraint
		checkPermission(SecurityConstants.MODIFY_THREAD_PERMISSION);
	}
	
	@Override
	public void checkPermission(Permission perm) {
//		if (perm instanceof FloodlightPermission) { // Weird classCircularityError here...
//			Thread t = Thread.currentThread();
//			if (appThreadSet.contains(t)) {
//				// Check FloodlightPermission directly
//				permStore.checkPermission(
//						((FloodlightPermission) perm).getType(), t);
//			}
//		} else {
			// Conduct original check first
//			java.security.AccessController.checkPermission(perm);

			Thread t = Thread.currentThread();
			if (appThreadSet.contains(t)) {
				// Translate Java Permission to FloodlightPermission
				// Still a pretty simple version
				if (perm instanceof java.io.FilePermission) {
					if (!perm.getActions().matches("read")) {
						permStore.checkPermission(
								PermissionType.FILE_SYSTEM_ACCESS,
								Thread.currentThread());
					}
				} else if (perm instanceof java.net.SocketPermission) {
					permStore.checkPermission(PermissionType.NETWORK_ACCESS,
							Thread.currentThread());
				} else if (perm instanceof java.lang.RuntimePermission) {
					permStore.checkPermission(
							PermissionType.PROCESS_RUNTIME_ACCESS,
							Thread.currentThread());
				}
			}
//		}
	}
	
	@Override
	public void checkPermission(Permission perm, Object context) {
		// Override AccessControlContext.checkPermission
		this.checkPermission(perm);
	}
	
	public void checkFloodlightPermission(FloodlightPermission perm) {
		// TODO Customized OpenFlow permissions
		Thread t = Thread.currentThread();
		if (appThreadSet.contains(t)) {
			// Check FloodlightPermission directly
			permStore.checkPermission((perm).getType(),t);
		}
		return;
	}
}
