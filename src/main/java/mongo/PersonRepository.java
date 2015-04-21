package mongo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findByLastname(String lastname);

	List<Person> findByFirstnameLike(String firstname);
}
