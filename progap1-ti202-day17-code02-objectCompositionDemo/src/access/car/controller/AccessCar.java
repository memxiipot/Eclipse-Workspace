package access.car.controller;

import car.model.Car;
public class AccessCar {

	public static void main(String[] args) {

		Car objGenesis = new Car();
		objGenesis.setName("Hyundai Genesis");
		objGenesis.setModel("2013 AT");
		
		//use of HAS-A
		objGenesis.engine.setName("2.0L Theta in-line 4:");
		objGenesis.engine.setModel("DOHC Automatic Transmission");
		
		System.out.println(objGenesis); //tatawagin ang toString automatically
		System.out.println(objGenesis.engine);
	
	}

}
