package annotation.dao;

import org.springframework.stereotype.Component;

@Component
public class ADao {

	public void daoDo() {
		System.out.println("in dao:" + 1);
	}

}
