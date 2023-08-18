package part_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int counter = 0;
		int [] countervalues = new int[7];
		String [] DaysOfTheWeek = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		while(counter < 7){
			System.out.println(counter + 1 + ". day of the week is " + DaysOfTheWeek[counter]+ " in Turkey");
			countervalues[counter] = counter;
			System.out.println(countervalues[counter]);
			counter += 1;
		}
		int i = 0;
		while(i<7) {
		System.out.println(countervalues[i]);
		i++;
		}
		
		System.out.println(DaysOfTheWeek[4]);		
		System.out.println(DaysOfTheWeek[6]);
		System.out.println(DaysOfTheWeek[2]);
		BufferedReader bfn = new BufferedReader(
				new InputStreamReader(System.in));
		int input = Integer.parseInt(bfn.readLine());
		int [] array = new int[input];
		array[234] = 5;
		System.out.println(array[234]);
		System.out.println(array[6]);
		System.out.println(array[input-1]);
		// Once the array's size is defined you can't change it. But you can determine array size by user input.
		String [] MonthsOfTheYear = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int f = 0;
		while(f < 12) {
			if (MonthsOfTheYear[f]== "April") {
				System.out.println("April is the " + (f + 1) + ". month of the year");
				break;
			}
			else {
				f++;
			};
			
		}
	}

}
