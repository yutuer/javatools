package annotation.handler;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import annotation.bean.ABean;
import annotation.service.AService;

public class AHandler implements FactoryBean<ABean>{

	@Autowired
	private AService aService;
	
	public void handler() {
		System.out.println(aService);
		aService.serviceDo();
	}

	@Override
	public ABean getObject() throws Exception {
		return new ABean();
	}

	@Override
	public Class<?> getObjectType() {
		return ABean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
