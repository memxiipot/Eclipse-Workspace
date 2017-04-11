package com.bpi.creditcard.exceptions;

public class StolenCreditCardException extends Exception {

	public StolenCreditCardException() {
		super("ALERT!!! This credit card is stolen. Call the police and apprehend this person.");
	}
	
	public StolenCreditCardException(String message) {
		super(message);
	}
}
