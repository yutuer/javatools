package annotation.dao;

import org.springframework.stereotype.Component;

import annotation.HandlerMain;

@Component
public class ADao {

	public void daoDo() {
		HandlerMain.logger.info("in Adao:" + 1);
	}

}
