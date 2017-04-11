package dls.csb.datacasting.demo;

public class TypecastingDemo {

	
	public static void main(String[] args) {
		//sample widening -> from small to large data type
		byte bNumber = 10;
		short sNumber = bNumber;
		int number = sNumber;
		long lNumber = number;
		float fNumber = lNumber;
		double dNumber = fNumber;
		
		System.out.println("double value: " + dNumber);
		
		//sample narrowing/explicit -> from large to small data type
		bNumber = (byte) dNumber;
		System.out.println("byte value: " + dNumber);
		
		//sample precision loss
		float fNumber2 = 1.5f;
		int number2 = (int) fNumber2;
		System.out.println("number 2 value: " + number2);
		
		//char equivalent from ASCII
		number = 65;
		char cLetter = (char) number;
		System.out.println("Letter equivalent of " + number + " is " + cLetter );
		
		cLetter = 'i';
		number = (int) cLetter;
		System.out.println("Number equivalent of " + cLetter + " is " + number );
		
	
	}

}
