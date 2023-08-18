package part_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyMethods {
	
	public static void DeveloperMethod(String variable) {
		System.out.println("This is a string printing method. And the string is: " + variable);
	}
	public static void DeveloperMethod(int variable) {
		System.out.println("This is a integer printing method. And the integer is: " + variable);
	}
	public static void DeveloperCalculatorSum(int FirstNumber, int SecondNumber) {
		System.out.println("First Number: " + FirstNumber + " Second Number: " + SecondNumber + "   Sum = " + (FirstNumber + SecondNumber));
	}
	public static void DeveloperCalculatorSubstraction(int FirstNumber, int SecondNumber) {
		System.out.println("First Number: " + FirstNumber + "  Second Number: " + SecondNumber + "   Substraction = " + (FirstNumber - SecondNumber));
	}
	public static void DeveloperCalculatorMultipication(int FirstNumber, int SecondNumber) {
		System.out.println("First Number: " + FirstNumber + "  Second Number: " + SecondNumber + "   Multipication = " + (FirstNumber * SecondNumber));
	}
	public static void DeveloperCalculatorDivision(int FirstNumber, int SecondNumber) {
		System.out.println("First Number: " + FirstNumber + "  Second Number: " + SecondNumber + "   Division = " + (FirstNumber / SecondNumber));
	}

	static BufferedReader bfn = new BufferedReader(
			new InputStreamReader(System.in));
	
	public static int GetUserInputNumberOne() throws NumberFormatException, IOException {
		System.out.println("Please enter first number: ");
		int number1 = Integer.parseInt(bfn.readLine());
		return number1;
	}
	
	public static int GetUserInputNumberTwo() throws NumberFormatException, IOException {
		System.out.println("Please enter second number: ");
		int number2 = Integer.parseInt(bfn.readLine());
		return number2;
	}
	
	public static void UserInputPrinter() throws IOException {
	while(true) {
		System.out.println("plese type something");
		String input = bfn.readLine();
		try {
			int index = Integer.parseInt(input);
			MyMethods.DeveloperMethod(index);
		}
		catch(NumberFormatException e){
			if(input.equals("false")) {
				System.out.println("thanks for playing");
				break;
			}
			else {
			MyMethods.DeveloperMethod(input);
			}
			}
	}
	}

	public static int DeveloperCalculator() throws IOException{
	while(true) {
	System.out.println("Type 1 for addition, 2 for substraction, 3 for multipication, 4 for division or to exit type 'false'");
	String choice = bfn.readLine();
	try {
		int isindex = Integer.parseInt(choice);
		int number1 = 0;
		int number2 = 0;
		switch(isindex) {
		case 1: 
			number1 = MyMethods.GetUserInputNumberOne();
			number2 = MyMethods.GetUserInputNumberTwo();
			MyMethods.DeveloperCalculatorSum(number1, number2);
			break;
		case 2:
			number1 = MyMethods.GetUserInputNumberOne();
			number2 = MyMethods.GetUserInputNumberTwo();
			MyMethods.DeveloperCalculatorSubstraction(number1, number2);
			break;
		case 3:
			number1 = MyMethods.GetUserInputNumberOne();
			number2 = MyMethods.GetUserInputNumberTwo();
			MyMethods.DeveloperCalculatorMultipication(number1, number2);
			break;
		case 4:
			number1 = MyMethods.GetUserInputNumberOne();
			number2 = MyMethods.GetUserInputNumberTwo();
			MyMethods.DeveloperCalculatorDivision(number1, number2);
			break;
		default:
			System.out.println("Wrong number");
		}
	}
	catch(NumberFormatException e) {
		if (choice.equals("false")) {
		System.out.println("thanks for calculating");
		break;
		}
		else {
		System.out.println("Please type a number or write 'false'");
		}
	}
	}
	return 0;
}
}

 