import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import org.apache.log4j.Logger;

public class ScriptEngineFactories {
	private static Logger log = Logger.getLogger(ScriptEngineFactories.class.getName());

	public static void main(String[] args) {
		List<ScriptEngineFactory> factories = new ScriptEngineManager().getEngineFactories();
		for (ScriptEngineFactory factory : factories) {
			log.info("lang name: " + factory.getLanguageName());
			log.info("engine name: " + factory.getEngineName());
			log.info(factory.getNames().toString());
		}
	}
}
