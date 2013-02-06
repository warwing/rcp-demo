package de.jardas.rcp.module1.api;

import de.jardas.rcp.common.misc1.SystemPropertyReader;

public class Module1Properties {

	private final static Module1Properties instance = new Module1Properties();
	private final static SystemPropertyReader systemProperties = SystemPropertyReader.getInstance();
	
	public static Module1Properties getInstance() {
		return instance;
	}
	
	public SystemPropertyReader getSystemProperties() {
		return systemProperties;
	}
	
}
