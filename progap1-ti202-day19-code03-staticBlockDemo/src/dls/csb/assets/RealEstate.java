package dls.csb.assets;

public class RealEstate extends Asset {

	//function overriding - changing the behavior of the inherited method from the parent class
	public void setName(String name) {
		System.out.println("buying lots and condominiums");
		this.name = name;
	}
	
	public void informInvestor() {
		System.out.println("Increase in property value.");
	}
}
