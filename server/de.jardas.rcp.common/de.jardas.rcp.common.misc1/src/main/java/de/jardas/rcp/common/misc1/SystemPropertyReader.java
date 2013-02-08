package de.jardas.rcp.common.misc1;

import java.util.HashMap;
import java.util.Map;

public class SystemPropertyReader {

	private final static SystemPropertyReader instance = new SystemPropertyReader();
	
	private Map<String, String> interestingProperties;
	
	public static SystemPropertyReader getInstance() {
		return instance;
	}
	
	public Map<String, String> getProperties() {
		final HashMap<String, String> map = new HashMap<String, String>();
		for(Object obj : System.getProperties().keySet()) {
			String key = obj.toString();
			if(key.startsWith("java")) {
				String value = System.getProperties().getProperty(key);
				System.out.println("Key: " + obj + ", Value: " + value);
				map.put(key, value);
			}
		}
		return map;
	}
	
	public static void main(String[] params) {
		SystemPropertyReader.getInstance().getProperties();
	}
}
