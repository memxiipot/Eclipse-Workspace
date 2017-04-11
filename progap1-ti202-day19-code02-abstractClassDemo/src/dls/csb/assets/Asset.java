package dls.csb.assets;

public abstract class Asset { //JavaBean

	public String name;
	public double value;
	
	public Asset() {
		System.out.println("asset constructor class");
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
	
	public abstract void informInvestor();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
