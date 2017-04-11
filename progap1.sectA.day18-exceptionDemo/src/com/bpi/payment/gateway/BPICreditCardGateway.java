package com.bpi.payment.gateway;

import com.bpi.creditcard.contract.BPIContractInterface;
import com.bpi.creditcard.exceptions.ExpiredCreditCardException;
import com.bpi.creditcard.exceptions.StolenCreditCardException;

import com.bpi.message.Messages;

public class BPICreditCardGateway implements Messages, BPIContractInterface {

	public boolean processPayment(String creditCard, double amount) 
		throws ExpiredCreditCardException, StolenCreditCardException{
		
		boolean isValid = true;
		if (validateCreditCard(creditCard)) {
			System.out.println(PAYMENT_OK +  amount);
			System.out.println(GOODBYE);
			return isValid;
		} else  {
			isValid = true;			
		}
		return isValid;
	}
	
	private boolean validateCreditCard(String creditCard) 
		throws ExpiredCreditCardException, StolenCreditCardException {
		
		if (creditCard.equals("111-111-1111")) { //111-111-1111 - stolen credit card
			//throw new StolenCreditCardException();
			throw new StolenCreditCardException("Tumawag ka ng pulis. Pakibilisan. Hulihin ang taong ito. Magnanakaw ito at ibatorlina na.");
		} else if (creditCard.equals("222-222-2222")) { //222-222-2222 - expired credit card
			throw new ExpiredCreditCardException();
		} else {
			return true;
		}		
	}
	
}
