package mongo;

public class Person {
	private String id;
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getIddddd() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [iddddd=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
