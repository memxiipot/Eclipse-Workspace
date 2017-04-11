package dls.csb.model;

public class Car {
	
	//instance variables
	public String color;
	public String manufacturer;
	public String model;
	public double price;
	public boolean isAutomatic;
	
	//constructors declarations with function overloading
	public Car() { //default constructor
		System.out.println("Constructor Car executed -1.");
	}
	public Car(String model, String manufacturer, double price, String color, boolean isAutomatic) { 
		System.out.println("Constructor Car executed -2.");
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.color = color;
		this.isAutomatic = isAutomatic;
	}
	//instance methods
	public void start() {
		System.out.println(model + "starts.");
	}
	public void accelerate() {
		System.out.println(model + "accelerate.");
	}
	public void brake() {
		System.out.println(model + "brake.");
	}
	public void stop() {
		System.out.println(model + "stop.");
	
	}
	
}
