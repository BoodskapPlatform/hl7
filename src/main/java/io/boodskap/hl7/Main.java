package io.boodskap.hl7;

/**

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jtwig.JtwigTemplate;
import org.reflections.Reflections;

import ca.uhn.hl7v2.model.Structure;

public class Main {

	public static Set<Class<? extends Structure>> getClasses(String pkg) throws Exception{

		Reflections reflections = new Reflections(pkg);

		Set<Class<? extends Structure>> allClasses = reflections.getSubTypesOf(Structure.class);
		
		return allClasses;
        
    }
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		JtwigTemplate template = JtwigTemplate.classpathTemplate("/decoder.twig");
		
		final List<String> VERSIONS = Arrays.asList("21", "22", "23", "231", "24", "25", "251", "26", "27", "28", "281");
		
		for(String version : VERSIONS) {

			final String pkg = String.format("io.boodskap.hl7.v%s", version);
			final String file = String.format("%s/Decoder.java", String.format("src/main/java/%s", pkg.replaceAll("\\.", "/")));
			System.out.println(file);
			Set<Class<? extends Structure>> classes = Main.getClasses(String.format("ca.uhn.hl7v2.model.v%s", version));
			Set<String> names = new HashSet<>();
			Set<String> snames = new HashSet<>();
			
			for(Class<?> clazz : classes) {
				
				if(clazz.isAnonymousClass() || clazz.isInterface() || Modifier.isAbstract( clazz.getModifiers())) continue;
				
				names.add(clazz.getName());
				snames.add(clazz.getSimpleName());
			}

			Map<String, Object> values = new HashMap<String, Object>();
			
			values.put("pkg", pkg);
			values.put("names", names);
			values.put("snames", snames);

			//JtwigModel model = JtwigModel.newModel(values);

			//template.render(model, new FileOutputStream(file));
		}
		
	}
}

**/

public class Main{
	
}