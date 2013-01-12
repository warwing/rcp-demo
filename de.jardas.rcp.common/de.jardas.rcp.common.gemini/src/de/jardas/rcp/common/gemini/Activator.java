package de.jardas.rcp.common.gemini;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private static Activator instance;
	private BundleContext context;

	public Activator() {
		instance = this;
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		this.context = context;
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		this.context = null;
	}

	public BundleContext getBundleContext() {
		return context;
	}

	public static Activator getDefault() {
		return instance;
	}
}
