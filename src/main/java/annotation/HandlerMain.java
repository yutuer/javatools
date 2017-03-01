package annotation;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import annotation.handler.AHandler;

public class HandlerMain {
	private static final Logger logger = LoggerFactory.getLogger(HandlerMain.class);
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String log4jPath = "log4j.properties";
		//配置log4j日志文件
		PropertyConfigurator.configureAndWatch(log4jPath, 1000);
		
//		ApplicationContext app = new ClassPathXmlApplicationContext("anno.xml");
//		AHandler ah = app.getBean(AHandler.class.getSimpleName(), AHandler.class);
//		ah.handler();
			
		BeanFactory app = new XmlBeanFactory(new ClassPathResource("anno.xml"));
		AHandler ah = app.getBean(AHandler.class.getSimpleName(), AHandler.class);
		logger.info("" + (ah != null));
	}
	
}
