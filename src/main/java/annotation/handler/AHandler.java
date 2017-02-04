package annotation.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.service.AService;

public class AHandler {

	@Autowired
	private AService aService;

	public void handler() {
		aService.serviceDo();
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("anno.xml");
		AHandler ah = app.getBean(AHandler.class.getSimpleName(), AHandler.class);
		ah.handler();

//		BeanFactory app = new XmlBeanFactory(new ClassPathResource("anno.xml"));
//		AHandler ah = app.getBean(AHandler.class.getSimpleName(), AHandler.class);
//		System.out.println(ah != null);
//		ah.handler();
	}
}
