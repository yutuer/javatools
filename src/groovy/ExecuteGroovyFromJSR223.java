package groovy;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExecuteGroovyFromJSR223 {
	public static void main(String[] args) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("groovy");
		try {
			engine.put("x", 1);
			engine.put("y", 2);
			engine.eval("println (x+y)");
			engine.eval(new FileReader("resources/groovy/test.groovy"));
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
