package net.floodlightcontroller.safethread.permissionmanager;

import java.security.BasicPermission;

public class FloodlightPermission extends BasicPermission {
	private static final long serialVersionUID = 11849305478L;
	
	protected final PermissionType type;
	
	public FloodlightPermission(String name, PermissionType type) {
		super(name);
		this.type = type;
	}
	
	public FloodlightPermission(String name, String actions, PermissionType type) {
		super(name, actions);
		this.type = type;
	}
	
	public PermissionType getType() {
		return type;
	}

	public static enum PermissionType {/*
		READ_TOPOLOGY,
		READ_ALL_FLOW,
		READ_STAT,
		READ_PKT_IN_PAYLOAD,
		PKT_IN_EVENT,
		FLOW_REMOVED_EVENT,
		ERROR_EVENT,
		TOPOLOGY_EVENT,
		FLOW_RECONCILE_EVENT,
		FLOW_MOD_ROUTE,
		FLOW_MOD_DROP,
		FLOW_MOD_MODIFY_HDR,
		MODIFY_ALL_FLOWS,
		SET_FLOW_PRIORITY,
		SET_DEVICE_CONFIG,
		SEND_PKT_OUT,
		SEND_BARRIER,*/
		NETWORK_ACCESS,
		FILE_SYSTEM_ACCESS,
		PROCESS_RUNTIME_ACCESS//,
		//KERNEL,
		//ALLOWED,
		//FORBIDDEN
	}

}
