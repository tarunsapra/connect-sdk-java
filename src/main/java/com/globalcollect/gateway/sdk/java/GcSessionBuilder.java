package com.globalcollect.gateway.sdk.java;

import java.net.URI;

/**
 * Builder for a {@link GcSession} object.
 */
public interface GcSessionBuilder {

	/**
	 * Sets the GlobalCollect platform API endpoint URI to use.
	 */
	GcSessionBuilder using(URI apiEndpoint);

	/**
	 * Sets the {@link GcConnection} to use.
	 */
	GcSessionBuilder using(GcConnection connection);

	/**
	 * Sets the {@link GcAuthenticator} to use.
	 */
	GcSessionBuilder using(GcAuthenticator authenticator);

	/**
	 * Sets the {@link GcMetaDataProvider} to use.
	 */
	GcSessionBuilder using(GcMetaDataProvider metaDataProvider);

	/**
	 * Creates a fully initialized {@link GcSession} object.
	 *
	 * @throws IllegalArgumentException if not all required components are set
	 */
	GcSession build();
}
