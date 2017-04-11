package com.dls.csb.accounting.controller;

import java.io.*;

import com.bpi.creditcard.exceptions.ExpiredCreditCardException;
import com.bpi.creditcard.exceptions.StolenCreditCardException;
import com.bpi.payment.gateway.BPICreditCardGateway;

import com.bpi.message.Messages;
public class PayTuition {

	public static void main(String[] args) {
		
		String creditCard = "";
		double amount = 0;
		
		System.out.println(Messages.WELCOME_SCHOOL);
		
		try {
			BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter credit card number: ");
			creditCard = buffRead.readLine();
			
			System.out.print("Enter tuition fee amount: ");
			amount = Double.parseDouble(buffRead.readLine());
			
			BPICreditCardGateway bpiPG = new BPICreditCardGateway();
			if (bpiPG.processPayment(creditCard, amount)) {
				
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.err.println("IOException occured - " + ioe.getMessage());
		} catch (ExpiredCreditCardException ecce) {
			System.err.println(ecce.getMessage());
		} catch (StolenCreditCardException scce) {
			System.err.println(scce.getMessage());
		}
		
		
	}

}
