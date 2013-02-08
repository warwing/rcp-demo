package de.jardas.rcp.module1.client.services;

import de.jardas.rcp.module1.api.Module1Properties;
import de.jardas.rcp.module1.api.Module1Service;

public class Module1ServiceImpl implements Module1Service {

	@Override
	public String getInfo() {
		return "User: " + Module1Properties.getInstance().getSystemProperties().getProperties().get("USER") + " uses Module1";
	}

}
