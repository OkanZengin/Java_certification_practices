package part_four;

public class Vehicles {
	String brand;
	String model;
	int year;
	int wheel_count;
	int seat_count;
	String color;
	String fuel_type;
	
	

	public Vehicles(String brand, String model, int year, int wheel_count, int seat_count, String color,
			String fuel_type) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.wheel_count = wheel_count;
		this.seat_count = seat_count;
		this.color = color;
		this.fuel_type = fuel_type;
	}



	public void give_introduction() {
		System.out.println("This vehicle produced by "+ brand );
		System.out.println("It's model is: "+model);
		System.out.println("It's went on market in "+year);
		if(wheel_count != 2) {
		System.out.println("It has " + wheel_count + " wheels as you can see and "+ seat_count + " seats");
		System.out.println("And it runs on "+ fuel_type);
		}
		System.out.println("This " + color + " color is special for this model, it's a brand new color for this type of vehicle");
	};
}

	