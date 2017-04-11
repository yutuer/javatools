package groovy;

import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.springframework.core.io.ClassPathResource;

public class ExecuteGroovyFromJSR223 {
	public static void main(String[] args) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("groovy");
		try {
			engine.put("x", 1);
			engine.put("y", 2);
			engine.eval("println (x+y)");
			engine.eval(new InputStreamReader(new ClassPathResource("groovy/test.groovy").getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
