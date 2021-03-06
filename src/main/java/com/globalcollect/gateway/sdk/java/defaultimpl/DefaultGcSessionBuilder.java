package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.net.URI;

import com.globalcollect.gateway.sdk.java.GcAuthenticator;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.GcSessionBuilder;

/**
 * Default {@link GcSessionBuilder} implementation.
 */
public class DefaultGcSessionBuilder implements GcSessionBuilder {

	private URI apiEndpoint;

	private GcConnection connection;

	private GcMetaDataProvider metaDataProvider;

	private GcAuthenticator authenticator;

	@Override
	public GcSessionBuilder using(URI apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
		return this;
	}

	@Override
	public GcSessionBuilder using(GcConnection connection) {
		this.connection = connection;
		return this;
	}

	@Override
	public GcSessionBuilder using(GcAuthenticator authenticator) {
		this.authenticator = authenticator;
		return this;
	}

	@Override
	public GcSessionBuilder using(GcMetaDataProvider metaDataProvider) {
		this.metaDataProvider = metaDataProvider;
		return this;
	}

	@Override
	public GcSession build() {
		return new DefaultGcSession(
				apiEndpoint,
				connection,
				authenticator,
				metaDataProvider
		);
	}
}
