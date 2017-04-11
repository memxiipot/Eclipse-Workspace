package dls.csb.assets;

public abstract class BankAccount extends Asset{
	
	//sample function overriding
	public void setName(String name) {
		System.out.println("putting the money in the bank");
		this.name = name;
	}
	
	//sample function overloading
	public void setName(String name, String message) {
	System.out.println(message);
	this.name = name;
	}
	
	public void informInvestor() {
		System.out.println("Adding more deposits thru fixed-income rates.");
	}

}
