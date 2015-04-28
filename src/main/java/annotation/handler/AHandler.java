package annotation.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.service.AService;

public class AHandler {
	@Autowired
	private AService aService;

	public void a() {
		aService.a();
	}

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("anno.xml");
		AHandler a = (AHandler) app.getBean(AHandler.class.getSimpleName());
		a.a();
	}
}
