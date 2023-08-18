package part_four;

public class OOP_one {
	public static void main(String Args[]) {
		
	Vehicles bike = new Vehicles("Bianci", "XK1200",2022, 2,1,"Sky At Night", "None");
	Vehicles car = new Vehicles("Audi", "A6 - Quattro", 2023, 4,5, "Egg White", "Diesel");
	Vehicles truck = new Vehicles("Volvo", "X-Trail 340", 2021, 10, 4," Red at Sea", "Diesel");

	System.out.println("Well, this bike?");
	bike.give_introduction();
	System.out.println("Well, this car?");
	car.give_introduction();
	System.out.println("Well, this truck?");
	truck.give_introduction();
}
}
