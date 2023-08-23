package part_nine;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Java_Generics_Main {

	public static void main(String[] args) {
		Java_Generics variables = new Java_Generics(345, "Hello");
		variables.PrintVariables();
		Object myvar = variables.getVariable1();
		System.out.println(myvar + "\n\n");

		Java_Generics_part_2<Integer, String> variables2 = new Java_Generics_part_2<>(345, "Hello");
		variables2.PrintVariables();
		int var_a = variables2.getVariable1();
		String var_b = variables2.getVariable2();
		System.out.println("var_a: " + var_a + "\nvar_b: " + var_b + "\n\n");

		Java_Generics_part_2<String, String> variables3 = new Java_Generics_part_2<>("345", "Hello");
		variables3.PrintVariables();

		System.out.println("Set type Generics");
		Set<String> DataSet_1 = new LinkedHashSet<>();
		DataSet_1.add("Hello");
		DataSet_1.add("My Friend");
		DataSet_1.add("Does");
		Set<String> DataSet_2 = new LinkedHashSet<>();
		DataSet_2.add("Everything");
		DataSet_2.add("My Friend");
		DataSet_2.add("Going Well?");

		Set<String> resultSet = Java_Generics_part_3.unifier(DataSet_1, DataSet_2);
		Iterator<String> iterate = resultSet.iterator();
		while (iterate.hasNext()) {
			String variable = iterate.next();
			System.out.println(variable);
		}
	
	}
	
}