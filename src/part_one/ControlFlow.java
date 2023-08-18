package part_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlFlow {

	public static void main(String[] args) throws IOException {
		
	String [] months = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};

	BufferedReader bfn = new BufferedReader(
			new InputStreamReader(System.in));
	while(true) {
	System.out.println("Please enter a number or to quit: type 'false'");
	String input = bfn.readLine();
		try {
		if(input.equals("false")) {
			System.out.println("thanks for playing");
			break;
		}
		else if(input != "false"){
			int index = Integer.parseInt(input);
			if(index< 13){
				System.out.println((index) + ". month is " + months[index-1]);
				}
			else if (index > 12){
				System.out.println("There aren't that many month's in a year :) ");
				}
			}
			else {
				System.out.println("typed wrong");
			}
		}
		catch (NumberFormatException e) {
            System.out.println("Typed wrong. Please enter a valid number or 'false' to quit.");
        } 
		catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }
	}
	}
}
