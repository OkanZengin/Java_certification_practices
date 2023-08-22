package part_nine;

public class Java_Generics_part_2<v1,v2> {

		v1 variable1;
		v2 variable2;
		
		public Java_Generics_part_2(v1 variable1, v2 variable2) {
			this.variable1 = variable1;
			this.variable2 = variable2;
		}
		
		public void PrintVariables() {
			System.out.println("Contents of Generic Class:\nVariable 1: " + variable1 + "\nVariable2: " + variable2);
		}

		public v1 getVariable1() {
			return variable1;
		}

		public void setVariable1(v1 variable1) {
			this.variable1 = variable1;
		}

		public v2 getVariable2() {
			return variable2;
		}

		public void setVariable2(v2 variable2) {
			this.variable2 = variable2;
		}


}
