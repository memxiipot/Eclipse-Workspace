package dls.csb.controller;

import dls.csb.assets.*;
import dls.csb.utility.Factory;

public class AccessAssets {
		
	static int assetCounter = 1;
	public static void main(String[] args) {
		
		//sample object casting - narrowing
		Security security = (Security)Factory.getInstance("Security");
		security.setName("Security Shares");
		security.setValue(1000000);
		
		System.out.println("Class name: " + security.getClassName());
		security.printMessage();
	}
	
	public static void printAssetDetails(Asset asset, String message) {
		System.out.println("\nAsset " + assetCounter);
		System.out.println("Creating an object of type " + message);
		System.out.println("Asset Name: "+ asset.getName());
		System.out.println("Asset Value: " + asset.getValue());
		assetCounter++;
	}
	
	
	
}
