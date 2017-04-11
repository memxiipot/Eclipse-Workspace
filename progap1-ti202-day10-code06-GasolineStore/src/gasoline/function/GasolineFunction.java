package gasoline.function;

import gasoline.reader.Reader;
import gasoline.utility.GasolineStore;

public class GasolineFunction {

	
	public static void main(String[] args) {
		
		GasolineStore objGas = new GasolineStore();
		
		int liters = Reader.readInt("Number of Liters");
		String fuelType = Reader.readString("Fuel Type").trim();
		
		//check if liters ordered is valid
		if (!objGas.isLitersValid(liters)) {
			System.out.println("Invalid liters purchased");
			return;
		}
		
		//check if fuel type selected is valid (1, 2 or 3)
		if (!objGas.isFuelTypeValid(fuelType)) {
			System.out.println("Invalid fuel type selected");
		}
		
		//compute the total purchased
		double purchaseAmount = objGas.computeFuelPurchased(liters, fuelType);
		System.out.println("Total purchase amount is " + purchaseAmount);
		
		//accept payment from the customer
		double paymentAmount = Reader.readDouble("Cash Amount Paid (PHP)");
		
		if (objGas.isPaymentAmountValid(paymentAmount) 
				&& (paymentAmount >= purchaseAmount)) {
			
			double changeAmount = paymentAmount - purchaseAmount;
			
			System.out.println("Change amount is " + changeAmount);
			System.out.println("Thank you for paying. Please come again");
		}
		else {
			System.out.println("Invalid payment amount");
			return; //System.exit(0);
		}
		
		
	}

}
