package engine.model;

public class Engine {

	public String name;
	public String model;
	
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
		//System.out.println("toString executed for Engine");
		return "\nEngine Details\n" 
				+ "Name: " + getName()
				+ "\nModel: " + getModel();
	}
	
	
	
	
}
