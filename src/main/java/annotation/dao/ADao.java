package annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import annotation.HandlerMain;
import annotation.handler.AHandler;


@Component
public class ADao {

	@Autowired
	private AHandler aHandler;

	public void daoDo() {
		System.out.println(aHandler);
		HandlerMain.logger.info("in Adao:" + 1);
	}

}
