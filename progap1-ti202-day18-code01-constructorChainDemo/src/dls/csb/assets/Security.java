package dls.csb.assets;

public class Security extends Asset {
	
	public String clazz = "Security class"; 
	
	
	public Security() {
		super(0, "a");
		System.out.println("Security contructor 1 executed");
	}
	
	public Security(String name) {
		super(0);
		System.out.println("Security contructor 2 executed");
	}
	
	public Security(double value) {
		this("", 0);
		System.out.println("Security contructor 3 executed");
	}
	
	public Security(String name, double value) {
		this("");
		System.out.println("Security contructor 4 executed");
	}
	
	public Security(double value, String name) {
		this(0);
		System.out.println("Security contructor 5 executed");
	}
	
	//function overriding - changing the behavior of inherited methon
	public void setName(String name) {
		System.out.println("buying shares from the companies.");
		this.name = name;
	}
	
	public String getClassName() {
		return this.clazz;
		//return super.clazz;
	}
	
	public void printMessage() {
		super.printMessage();
		System.out.println("This message is from the security class");
	}

}
