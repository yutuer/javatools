package annotation.handler;

import org.springframework.beans.factory.annotation.Autowired;

import annotation.service.AService;

public class AHandler {

	@Autowired
	private AService aService;

	public void handler() {
		aService.serviceDo();
	}

}
