package gasoline.utility;

public class GasolineStore {

	public boolean isLitersValid (int litersPurchased) {
		return (litersPurchased > 0)?true:false;
	}
	
	public boolean isFuelTypeValid (String fuelType) {
		boolean isValid = true;
		
		switch (fuelType) {
			case "1":
			case "2":
			case "3":
				break;
			default:
				isValid = false;
				break;
		}
		return isValid;
	}
	
	public boolean isPaymentAmountValid (double amount) {
		return (amount > 0)?true:false;
	}
	
	public double computeFuelPurchased (int litersPurchased, String fuelType) {
		double purchaseAmount = 0;
		
		switch (fuelType) {
			case "1":
				purchaseAmount = litersPurchased * 56;
				break;
			case "2":
				purchaseAmount = litersPurchased * 42;
				break;
			case "3":
				purchaseAmount = litersPurchased * 30;
				break;
		}
		return purchaseAmount;
	
	}
	
}
