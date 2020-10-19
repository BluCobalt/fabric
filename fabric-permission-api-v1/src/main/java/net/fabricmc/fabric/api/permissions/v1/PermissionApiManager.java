package net.fabricmc.fabric.api.permissions.v1;

import java.util.Optional;

import com.google.common.base.Preconditions;

/**
 * Stores an instance of the current permission api implementation
 */
public class PermissionApiManager {
	/**
	 * Suppress default constructor to ensure non-instantiability
	 */
	private PermissionApiManager() {
		throw new AssertionError("You should not be attempting to instantiate this class!");
	}

	private static PermissionApi currentApi = null;

	public static void setPermissionApi(PermissionApi api) {
		Preconditions.checkNotNull(api, "api was null");
		currentApi = api;
	}

	public static Optional<PermissionApi> getApi() {
		return Optional.ofNullable(currentApi);
	}

	public static PermissionApi getApiOrElseThrow() {
		return getApi().orElseThrow(() -> new IllegalStateException("No Permission API Registered!"));
	}
}
