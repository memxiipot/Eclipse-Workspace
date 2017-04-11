package car.model;

import engine.model.Engine;
public class Car { //JavaBean

	public String name;
	public String model;
	
	//this is the Has-A relationship
	public Engine engine = new Engine();
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setModel(String model) {
		this.model = model;		
	}
	
	public String getModel() {
		return model;
	}
	
	//function overriding
	public String toString() {
		//System.out.println("toString executed for Car");
		return "Car Details\n" 
				+ "Name: " + getName()
				+ "\nModel: " + getModel();
	}
	
	
	
	
	
	
}
