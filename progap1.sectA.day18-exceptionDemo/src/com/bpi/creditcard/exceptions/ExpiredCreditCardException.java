package com.bpi.creditcard.exceptions;

public class ExpiredCreditCardException extends Exception {

	public ExpiredCreditCardException() {
		super("ALERT!!! This is an expired credit card. Get a scissor and cut the credit card in half.");
	}
	
	public ExpiredCreditCardException(String message) {
		super(message);
	}
}
