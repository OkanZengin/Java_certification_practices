package part_nine;

public class Teacher extends Person {
	
		
	public Teacher(String name, int age, String role) {
		super(name, age, role);
	}


	public void giveHomework() {
		System.out.println("Homework given");
	}
	

	@Override
	public void work() {
		System.out.println(name + " Teacher Teaching...");
	}


	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", role=" + role + "]";
	}

}
