package part_seven;

import java.util.Objects;

public class Vehicles implements Comparable<Vehicles>{
	String brand;
	String model;
	int price;
	boolean is4wheel;

	
	
	public Vehicles(String model, String brand, int price, boolean is4wheel) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.is4wheel = is4wheel;
	}
	
	
	public String toString() {
		return "Vehicles [brand= " + brand + ", model=" + model + ", price=" + price + ", is4wheel=" + is4wheel + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(brand, is4wheel, model, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicles other = (Vehicles) obj;
		return Objects.equals(brand, other.brand) && is4wheel == other.is4wheel && Objects.equals(model, other.model)
				&& price == other.price;
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isIs4wheel() {
		return is4wheel;
	}
	public void setIs4wheel(boolean is4wheel) {
		this.is4wheel = is4wheel;
	}


	@Override
	public int compareTo(Vehicles o) {
		if (this.price > o.price) {
			return -1;
		}
		else if (this.price<o.price) {
			return 1;
		}		
		return 0;
	}
	
	

}
