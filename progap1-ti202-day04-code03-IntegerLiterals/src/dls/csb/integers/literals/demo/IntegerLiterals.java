package dls.csb.integers.literals.demo;

public class IntegerLiterals {
	
	public static void main(String[] args) {
		//INTEGER LITERALS
		
		byte num1 = 100;
		System.out.println("byte value: " + num1);
		
		short num2 = 20000;
		System.out.println("short value: " + num2);
		
		int num3 = 300000000;
		System.out.println("int value: " + num3);
		
		for (int ctr = 1; ctr < 10; ctr++) {
			System.out.println(ctr + ". " + "I love JAVA programming");
		}
		
		long num4 = 400000000;
		System.out.println("long value: " + num4);
		
		//FLOATING POINT LITERALS
		
		float pricePerKiloOfRice = 42.20F; // (float) 24.20
		System.out.println("Price per kilo of Rice: " + pricePerKiloOfRice);

		double quantity = 6.5;
		System.out.println("Quantity bought: " + quantity);
		
		System.out.println("Amount: " + (pricePerKiloOfRice * quantity));
		
		//BOOLEAN AND STRING LITERALS
		
		boolean isPayDay = false;
		boolean isSeptember= true;
		
		if (isPayDay) {
			System.out.println("it is PAYDAY");
		}
		else {
			System.out.println("it is \tnot payday");
		}
		
		if (isSeptember) {
			System.out.println("september \nbelongs to ber months");
		}
		else {
			System.out.println("september DOES not belong to ber months");
		}
		
		//CHAR LITERALS
		
		char midInitial = 'A';
		System.out.println("Middle Initial: " + midInitial);
		
		String midInitial2 = "B.";
		System.out.println("Middle Initial: " + midInitial2);
		
		int mathGrade = 100;
		System.out.println("Math Grade: " + mathGrade);
		
		String word = "";
		System.out.println("Word: " + word);
		
		System.out.println("Modulo Value: " + (23 % 5)); //modulo value is the remainder
		
		//INCREMENT AND DECREMENT
		
		int no1 = 0;
		no1 = no1 + 1; //no1++; no1 += 1; ++no1
		System.out.println("No. 1 value: (no1++) " + no1++);
		System.out.println("No. 1 value: (++no1) " + ++no1);
		
		int value = 5;
		int sum1 = value++ + 10; //application of postfix to an expression
		int sum2 = ++value +10; //++value prefix = add +2 fix
		System.out.println("Value: " + value);
		System.out.println("Sum 1 Value++: " + sum1);
		System.out.println("Sum 2 ++Value: " + sum2);
		
		int value1 = 5;
		int value2 = 10;
		int larger = 0;
		
		if (value1 > value2) {
			larger = value1;
		}
		else {
			larger = value2;
		}
		System.out.println("Larger value between " + value1 + " and " + value2 + " is " + larger);
		
	}

}
