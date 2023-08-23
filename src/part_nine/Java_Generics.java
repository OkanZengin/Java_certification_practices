package part_nine;

public class Java_Generics {
	Object variable1;
	Object variable2;

	public Java_Generics(Object variable1, Object variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public void PrintVariables() {
		System.out.println("Variable 1: " + variable1);
		System.out.println("Variable 2: " + variable2);
	}

	public Object getVariable1() {
		return variable1;
	}

	public void setVariable1(Object variable1) {
		this.variable1 = variable1;
	}

	public Object getVariable2() {
		return variable2;
	}

	public void setVariable2(Object variable2) {
		this.variable2 = variable2;
	}

}
