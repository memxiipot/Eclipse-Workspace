
package exchange.utility;

public class CurrencyExchange {

	public double convertCurrencyAmount (double currencyValue, 
										String foreignCurrencyType) {
		double convertedAmount = 0;
		
		switch (foreignCurrencyType) {
			case "US$":
				convertedAmount = currencyValue / 43;
				break;
			case "EURO":
				convertedAmount = currencyValue / 43;
				break;
			case "YEN":
				convertedAmount = currencyValue / 43;
				break;
		}
		return convertedAmount;
	}
	
	public boolean checkCurrencyAmountNegative (double currencyValue) {
		return (currencyValue > 0)?true:false;
	}
	
	public boolean checkCurrencySelected (String currency) {
		boolean isValid = true;
		
		switch (currency) {
			case "US$":
			case "EURO":
			case "YEN":
				break;
			default:
				isValid = false;
				break;		
		}
		return isValid;	
		
	}
	
}
