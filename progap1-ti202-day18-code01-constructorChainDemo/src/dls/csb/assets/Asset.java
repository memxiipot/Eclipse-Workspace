package dls.csb.assets;

public class Asset { //JavaBean

	public String name;
	public double value;
		
	public String clazz = "Asset class"; 
	
	
	//5 constructors of type Asset
	//constructors - used to perform object instantiation
	//use the 'new' keyword
	public Asset() {
		this(1, "");
		System.out.println("Asset contructor 1 executed");
	}
	
	public Asset(String name) {
		System.out.println("Asset contructor 2 executed");
	}
	
	public Asset(double value) {
		this();
		System.out.println("Asset contructor 3 executed");
	}
	
	public Asset(String name, double value) {
		System.out.println("Asset contructor 4 executed");
	}
	
	public Asset(double value, String name) {
		System.out.println("Asset contructor 5 executed");
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	public void printMessage() {
		System.out.println("This message is from the asset class");
	}
}
