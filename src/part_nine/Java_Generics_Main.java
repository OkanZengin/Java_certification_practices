package part_nine;

public class Java_Generics_Main {

	public static void main(String[] args) {
		Java_Generics variables = new Java_Generics(345,"Hello");
		variables.PrintVariables();
		Object myvar = variables.getVariable1();
		System.out.println(myvar);
		
		Java_Generics_part_2<Integer, String> variables2 = new Java_Generics_part_2<>(345,"Hello");
		variables2.PrintVariables();
		int var_a = variables2.getVariable1();
		String var_b = variables2.getVariable2();
		System.out.println("var_a: "+var_a+"\nvar_b: "+var_b);
	}

}
