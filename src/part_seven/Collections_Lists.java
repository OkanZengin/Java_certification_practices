package part_seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collections_Lists {
	public void list_strings_method() {
		ArrayList<String> myList = new ArrayList<String>();
		String[] namesArray = { "Ali", "Arslan", "Mahmut", "Okan", "Orkun", "Burak", "Cengiz", "Kemal", "Yiğit",
				"Selçuk" };
		Collection<String> ListOfNames = Arrays.asList(namesArray);
		myList.addAll(ListOfNames);
		System.out.println("String Lists and sorting: \nStrings in the list before sorting: \n" + myList
				+ "\nStrings in the list after sorting: ");
		Collections.sort(myList);
		System.out.println(myList + "\n\n");
	}

	public void list_integers_method() {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(234);
		numbers.add(34);
		numbers.add(6754);
		numbers.add(504);
		System.out.println("integer lists and sorting \n" + numbers + "\nposition of 6754 before sorting: "
				+ (numbers.indexOf(6754) + 1) + "\n");
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("position of 6754 after sorting: " + (numbers.indexOf(6754) + 1) + "\n");
	}

	public void listvehicles() {
		HashSet<Vehicles> vehicles = new HashSet<Vehicles>();
		vehicles.add(new Vehicles("XC90", "Volvo", 5000000, true));
		vehicles.add(new Vehicles("XC40", "Volvo", 4500000, true));
		vehicles.add(new Vehicles("KN-3300", "Yamaha", 1500000, false));
		System.out.println("Listing vehicles, each value is in a new line");
		for (Vehicles vehicle : vehicles) {
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Price: " + vehicle.getPrice());
			System.out.println("Is Four Wheeled?: " + vehicle.isIs4wheel() + "\n");
		}

	}

	public void listtvehicles() {
		LinkedHashSet<Vehicles> vehicles = new LinkedHashSet<Vehicles>();
		vehicles.add(new Vehicles("XC90", "Volvo", 5000000, true));
		vehicles.add(new Vehicles("KN-3300", "Yamaha", 1500000, false));
		vehicles.add(new Vehicles("XC40", "Volvo", 4500000, true));
		System.out.println("Listing vehicles, each vehicle is in a new line");
		for (Vehicles vehicle : vehicles) {
			System.out.println(vehicle);
		}
		ArrayList<Vehicles> newvehicles = new ArrayList<Vehicles>(vehicles);
		Collections.sort(newvehicles);
		System.out.println("\nListing vehicles, sorted by price, each vehicle is in a new line");
		for (Vehicles vehicle : newvehicles) {
			System.out.println(vehicle);
		}
	}

}
