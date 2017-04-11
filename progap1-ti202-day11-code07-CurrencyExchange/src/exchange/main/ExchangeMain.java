package exchange.main;

import exchange.reader.Reader;
import exchange.utility.CurrencyExchange;

public class ExchangeMain {

	public static void main(String[] args) {
		
		double currencyValue = Reader.readInt("Philippine Peso Amount");
		String foreignCurrencyType = Reader.readString("Enter Foreign Currency").trim();
		
		CurrencyExchange objExchange = new CurrencyExchange();
		
		//check if currency amount is a positive number
		if (!objExchange.checkCurrencyAmountNegative(currencyValue)) {
			System.out.println("Invalid currency value.");
			return;
		}
		
		//check currency type
		if (!objExchange.checkCurrencySelected(foreignCurrencyType)) {
			System.out.println("Invalid currency type");
		}
		
		double convertedAmount = objExchange.convertCurrencyAmount (currencyValue, 
																	foreignCurrencyType); 
			System.out.println("The amount converted from " + currencyValue + " to "
					+ foreignCurrencyType + " is " + convertedAmount);
		
	}
				
}


