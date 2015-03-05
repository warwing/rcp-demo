package de.jardas.rcp.module1.client.pub;

import de.jardas.rcp.module1.api.Module1Service;
import de.jardas.rcp.module1.client.services.Module1ServiceImpl;

public class Module1ServiceFactory {

	private static Module1Service module1Service;
	
	public static Module1Service getModule1Service() {
		if (module1Service == null)  {
			module1Service = new Module1ServiceImpl();
		}
		return module1Service;
	}
	
}
