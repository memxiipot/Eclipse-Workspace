package dls.csb.assets;

public abstract class Security extends Asset {
	
	//function overriding - changing
	public void setName(String name) {
		System.out.println("buying shares from the companies.");
		this.name = name;
	}
	
	//abstact -> method overriding
	

	
	public void informInvestor() {
		System.out.println("Buying of shares from a company.");
	}
}
