package net.floodlightcontroller.safethread.permissionmanager;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.safethread.permissionmanager.FloodlightPermission.PermissionType;

public interface IPermissionStorageService extends IFloodlightService {
	public void checkPermission(PermissionType perm,
			Thread app) throws SecurityException;
}
