package practice.one;

import practice.one.reader.*;
import practice.one.utility.PracticeUtility;

public class ParacticeOne {
	
	public static void main(String[] args) {
	
		do {
			
		String cardNum = Reader.readString("Enter Credit Card Number");
		
		if (PracticeUtility.check(cardNum)) {
			System.out.println("Valid Card Number");
			return;
		} else { System.out.println("Invalid Card Number"); }

		} while (false);
	}

}
