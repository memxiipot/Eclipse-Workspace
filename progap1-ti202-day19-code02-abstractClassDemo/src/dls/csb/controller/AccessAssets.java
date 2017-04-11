package dls.csb.controller;

import dls.csb.assets.*;
import dls.csb.utility.Factory;

public class AccessAssets {
		
	static int assetCounter = 1;
	public static void main(String[] args) {
		
		//sample object casting - narrowing
		BankAccount bankAccount = (BankAccount)Factory.getInstance("BankAccount");
		bankAccount.setName("BPI Bank Account");
		bankAccount.setValue(500000);
		printAssetDetails(bankAccount, "BankAccount Object Creation");
	
		//new code
		security.informInvestor();
		security.printmessage();
		//sample object casting - narrowing
		Security security = (Security)Factory.getInstance("Security");
		security.setName("Security Shares");
		security.setValue(1000000);
		printAssetDetails(security, "Security Object Creation");
		
		//continue doing all the object creation: RealEstate, SavingsAccount...
		
		RealEstate realEstate = (RealEstate)Factory.getInstance("RealEstate");
		realEstate.setName("Real Estate stuff");
		realEstate.setValue(200000);
		printAssetDetails(realEstate, "RealEstate Object Creation");
		
		SavingsAccount savingsAccount = (SavingsAccount)Factory.getInstance("SavingsAccount");
		savingsAccount.setName("BPI Savings Account");
		savingsAccount.setValue(300000);
		printAssetDetails(savingsAccount, "SavingsAccount Object Creation");
		
		CheckingAccount checkingAccount = (CheckingAccount)Factory.getInstance("CheckingAccount");
		checkingAccount.setName("BPI Checking Account");
		checkingAccount.setValue(300000);
		printAssetDetails(checkingAccount, "CheckingAccount Object Creation");
		
		Stocks stocks = (Stocks)Factory.getInstance("Stocks");
		stocks.setName("Stocks sumting");
		stocks.setValue(1000000);
		printAssetDetails(stocks, "Stocks Object Creation");
		
		Bond bond = (Bond)Factory.getInstance("Bond");
		bond.setName("Bond stuff");
		bond.setValue(2000000);
		printAssetDetails(bond, "Bond Object Creation");
		
		
		

	}
	
	public static void printAssetDetails(Asset asset, String message) {
		System.out.println("\nAsset " + assetCounter);
		System.out.println("Creating an object of type " + message);
		System.out.println("Asset Name: "+ asset.getName());
		System.out.println("Asset Value: " + asset.getValue());
		assetCounter++;
	}
	
	
	
}
