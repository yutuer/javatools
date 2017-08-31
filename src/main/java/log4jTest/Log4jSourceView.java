package log4jTest;

import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerRepository;

public class Log4jSourceView {
	
	public static void main(String[] args) {
		URL resource = Thread.currentThread().getContextClassLoader().getResource("log4j.properties");
		LoggerRepository loggerRepository = LogManager.getLoggerRepository();
		new PropertyConfigurator().doConfigure(resource.getPath(), loggerRepository);
		Logger rootLogger = loggerRepository.getRootLogger();
		rootLogger.info("1111");
		
		Logger logger = Logger.getLogger(Log4jSourceView.class);
		logger.error("222");
	}
}
