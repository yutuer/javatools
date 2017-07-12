package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import annotation.dao.ADao;

@Component
public class AService {

	@Autowired(required = false)
	private ADao adao;

	public void serviceDo() {
		System.out.println(adao);
		adao.daoDo();
	}

}
