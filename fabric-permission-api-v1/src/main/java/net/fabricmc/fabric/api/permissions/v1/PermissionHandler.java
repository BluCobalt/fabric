package net.fabricmc.fabric.api.permissions.v1;

/**
 * Base class for granting and revoking permissions
 */
public interface PermissionHandler {
	default boolean hasPermission(String perm, Permissible permissible) {
		return permissible.hasPermission(perm);
	}

	/**
	 * @param perm the permission's key
	 * @param permissible the permissible that should be granted the permission
	 * @return returns {@code false} if the permission was already granted
	 */
	boolean grantPermission(String perm, Permissible permissible);

	/**
	 * @param perm the permission's key
	 * @param permissible the permissible that should be granted the permission
	 * @return returns {@code false} if the permission was already revoked
	 */
	boolean revokePermission(String perm, Permissible permissible);
}
