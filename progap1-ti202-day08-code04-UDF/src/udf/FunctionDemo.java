package udf;

import udf.reader.Reader;
import udf.utility.MathOperations;

public class FunctionDemo {

	public static void main(String[] args) {
		int number = 5;
		FunctionDemo objFD = new FunctionDemo(); //object creation
		number = objFD.changeNumber(number);
		System.out.println("New Change Value: " + number);
		
		int operand1 = Reader.readInt("Enter First Operand");
		int operand2 = Reader.readInt("Enter Second Operand");
		
		int sum = MathOperations.doAdd(operand1, operand2);
		System.out.println("Summation value is" + sum);
		
		MathOperations mathObj = new MathOperations();
		
		int dif = mathObj.doSub(operand1, operand2);
		System.out.println("Difference value is" + dif);
		
		int pro = MathOperations.doMult(operand1, operand2);
		System.out.println("Product value is" + pro);
		
		int quo = MathOperations.doDiv(operand1, operand2);
		System.out.println("Quotient valus is" + quo);
		
		float rem = mathObj.doRem(operand1, operand2);
		System.out.println("Remainder value is" + rem);
		
	}
	
	public int changeNumber (int numero) {
		numero = 10;
		return numero;
	}
	
	/*
	FIRST EXAMPLE
	number = changeNumber(number)
	System.out.println("New Change Value: " + number);
	
	public static int changeNumber (int numero) {
		numero = 10;
		return numero;
	}
	*/

}
