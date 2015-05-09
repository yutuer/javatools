package mongo.module;

import java.util.List;

import mongo.Person;

import com.google.common.collect.Lists;

public class ExtModule extends AbstractModule {

	private static final long serialVersionUID = -3451179304479207599L;
	private long id;
	private int level = 1;
	private int crown;
	private Person person;
	private List<Person> persons = Lists.newArrayList();

	public ExtModule() {
		super();
	}

	public ExtModule(Long playerId) {
		super(playerId);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCrown() {
		return crown;
	}

	public void setCrown(int crown) {
		this.crown = crown;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "ExtModule [id=" + id + ", level=" + level + ", crown=" + crown + ", person=" + person
				+ ", persons=" + persons + "]";
	}

}
