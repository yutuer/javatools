package annotation;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import annotation.handler.AHandler;

public class HandlerMain {
	public static final Logger logger = LoggerFactory.getLogger(HandlerMain.class);
	
	public static void main(String[] args) {
		String log4jPath = "log4j.properties";
		//配置log4j日志文件
		PropertyConfigurator.configureAndWatch(log4jPath, 1000);
		
		try(ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("anno.xml")){
			//此方法会通知所有实现了lifeCycle接口的类
			context.start();
			
			AHandler ah = context.getBean(AHandler.class.getSimpleName(), AHandler.class);
			ah.handler();
			
			context.stop();
		}
			
//		BeanFactory app = new XmlBeanFactory(new ClassPathResource("anno.xml"));
//		AHandler ah = app.getBean(AHandler.class.getSimpleName(), AHandler.class);
//		logger.info("" + (ah != null));
	}
	
}
