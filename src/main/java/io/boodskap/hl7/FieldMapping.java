package io.boodskap.hl7;

import java.util.Properties;

public class FieldMapping {
	
	private static Properties props = new Properties();
	
	static {
		try {
			props.load(FieldMapping.class.getResourceAsStream("/field-mapping.txt"));
		}catch(Exception ex) {
			ex.printStackTrace();
			System.err.println("*** FIELD MAPPING WON'T WORK ***");
		}
	}
	
	public static void put(Properties nprops, boolean clear) {
		if(clear) props.clear();
		props.putAll(nprops);
	}

	public static String get(String name) {
		return props.getProperty(name, name);
	}
}
