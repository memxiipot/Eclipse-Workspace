package dls.csb.utility;

import dls.csb.assets.*;

public class Factory {

	public static Asset getInstance(String assetName) {
		Asset asset = null;
		
		switch (assetName) {
			case "Asset":
				asset = new Asset();
				break;
			case "BankAccount":
				//sample object casting - widening
				asset = new BankAccount();
				break;
			case "Bond":
				//sample object casting - widening
				asset = new Bond();
				break;
			case "CheckingAccount":
				//sample object casting - widening
				asset = new CheckingAccount();
				break;
			case "RealEstate":
				//sample object casting - widening
				asset = new RealEstate();
				break;
			case "SavingsAccount":
				//sample object casting - widening
				asset = new SavingsAccount();
				break;
			case "Security":
				//sample object casting - widening
				asset = new Security();
				break;
			case "Stocks":
				//sample object casting - widening
				asset = new Stocks();
				break;
		}
		
		return asset;
	
	}
}
