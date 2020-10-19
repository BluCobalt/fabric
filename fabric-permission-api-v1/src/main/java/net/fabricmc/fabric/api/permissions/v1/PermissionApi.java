package net.fabricmc.fabric.api.permissions.v1;

public interface PermissionApi {
	PermissionHandler getPermissionHandler();

	PermissionSaveHandler getPermissionSaveHandler();
}
