package dls.csb.controller;

import dls.csb.model.Car;

public class AccessCar {

	
	public static void main(String[] args) {
		 AccessCar access = new AccessCar();
		 Car nissanObj = new Car();
		 nissanObj.model = "2005 Skyline";
		 nissanObj.manufacturer = "Nissan Motors";
		 nissanObj.color = "Blue";
		 nissanObj.isAutomatic = true;
		 nissanObj.price = 1000000;
		 access.printCarDetails(nissanObj, "\nNissan Car Details");
		 		
		
		 Car MitsubishiObj = new Car();
		 MitsubishiObj.model = "2005 Eclipse";
		 MitsubishiObj.manufacturer = "Mitsubishi Motors";
		 MitsubishiObj.color = "Red";
		 MitsubishiObj.isAutomatic = false;
		 MitsubishiObj.price = 2000000;
		 access.printCarDetails(MitsubishiObj, "\nMitsubishi Car Details");
	 		
	 
		 Car MercedesbenzObj = new Car();
		 MercedesbenzObj.model = "C-class";
		 MercedesbenzObj.manufacturer = "Mercedes Benz Motors";
		 MercedesbenzObj.color = "Mat Black";
		 MercedesbenzObj.isAutomatic = true;
		 MercedesbenzObj.price = 5000000;
		 access.printCarDetails(MercedesbenzObj, "\n Mercedes Benz Car Details");
		 
		
	}
	public void printCarDetails(Car kotse, String msg) {
		 System.out.println(msg);
		 System.out.println("======================");
		 System.out.println("Model: " + kotse.model);
		 System.out.println("Price: " + kotse.price);
		 System.out.println("Color: " + kotse.color);
		 
		 System.out.println("Transmission Type: ");
		 if (kotse.isAutomatic){
			 System.out.println("Automatic\n");
		 }else {
			 System.out.println("Manual\n");
		 }
		 kotse.start();
		 kotse.accelerate();
		 kotse.brake();
		 kotse.stop();
		 
	}
}
