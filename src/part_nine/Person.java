package part_nine;

public class Person {

	String name;
	int age;
	String role;

	public Person(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public void greet(String name) {
		System.out.println("Hello there, I'm" + name + " how are you?");
	}

	public void work() {
		System.out.println(name + " Person working");
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", role=" + role + "]";
	}
	
}
