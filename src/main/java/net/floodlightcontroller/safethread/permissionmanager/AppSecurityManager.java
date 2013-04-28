package net.floodlightcontroller.safethread.permissionmanager;

import java.security.Permission;
import java.util.Set;

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
	public void checkPermission(Permission perm) throws SecurityException {
//		if (perm instanceof FloodlightPermission) {
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
				// Check FloodlightPermission
				if (perm instanceof java.lang.RuntimePermission) {
					permStore.checkPermission(
							PermissionType.PROCESS_RUNTIME_ACCESS,
							Thread.currentThread());
				} else if (perm instanceof java.net.SocketPermission) {
					permStore.checkPermission(PermissionType.NETWORK_ACCESS,
							Thread.currentThread());
				} else if (perm instanceof java.io.FilePermission) {
					if (!perm.getActions().matches("read")) {
						permStore.checkPermission(
								PermissionType.FILE_SYSTEM_ACCESS,
								Thread.currentThread());
					}
				}
			}
//		}
	}
}
