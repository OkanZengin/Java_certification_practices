package part_nine;

public class Student extends Person {
		
	
	
	public Student(String name, int age, String role) {
		super(name, age, role);

	}

	public void doHomework() {
		System.out.println("Homework finished");
	}
	
	@Override
	public void work() {
		System.out.println(name + " Student Studying...");
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", role=" + role + "]";
	}
	
	

}
