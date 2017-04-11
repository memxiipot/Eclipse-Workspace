package com.bpi.creditcard.contract;

import com.bpi.creditcard.exceptions.ExpiredCreditCardException;
import com.bpi.creditcard.exceptions.StolenCreditCardException;

public interface BPIContractInterface {

	public boolean processPayment(String creditCard, double amount) 
		throws ExpiredCreditCardException, StolenCreditCardException;  
}
