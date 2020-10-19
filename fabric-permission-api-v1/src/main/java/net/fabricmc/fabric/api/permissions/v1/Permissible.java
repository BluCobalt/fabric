package net.fabricmc.fabric.api.permissions.v1;

/**
 * Base class for objects that are permissible
 */
public interface Permissible {
	/**
	 * Specifies whether the object has the requested permission
	 * @param perm the permission's key
	 * @return whether the permission was found
	 */
	boolean hasPermission(String perm);
}
