package de.jardas.rcp.module1.server;

import de.jardas.rcp.module1.api.Module1Service;

public class Module1ServiceImpl implements Module1Service {
	private final String info = "Module 1";

	public String getInfo() {
		return info;
	}
}
