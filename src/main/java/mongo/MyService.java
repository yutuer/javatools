package mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	private final PersonRepository repository;

	@Autowired
	public MyService(PersonRepository repository) {
		this.repository = repository;
	}

	public void doWork() {

		repository.deleteAll();

		Person person = new Person();
		person.setFirstName("Oliver");
		person.setLastName("Gierke");
		person = repository.save(person);

		List<Person> lastNameResults = repository.findByLastname("Gierke");
		List<Person> firstNameResults = repository.findByFirstnameLike("Oli*");
	}
	
}
