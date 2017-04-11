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
		 //creating of another object
		 Car mitsubishiObj = new Car("2005 Eclipse", "Nissan Motors",  2000000, "Red", false);
		 access.printCarDetails(mitsubishiObj, "\nMitsubishi Car Details");
		 
		 Car hondaObj = new Car("2005 Eclipse", "Honda Motors",  2000000, "Red", false);
		 access.printCarDetails(hondaObj, "\nHonda Car Details");
		 
		 access.printCarDetails(nissanObj, "\nNissan Car Details");
		 
		 access.printCarDetails(mitsubishiObj, "\nMitsubishi Car Details");
		 
		 //nisaanObj.manufacturer = "Nissan Motors Philippines";
		 access.printCarDetails(nissanObj, "\nHonda Car Details");
		 
		 access.printCarDetails(hondaObj, "\nHonda Car Details");
		 
		 access.printCarDetails(mitsubishiObj, "\nMitsubishi Car Details");
		 	 		
		
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
