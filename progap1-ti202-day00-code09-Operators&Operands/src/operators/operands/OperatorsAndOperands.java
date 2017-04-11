package operators.operands;

import java.util.*;
import java.io.*;

public class OperatorsAndOperands {

	private static Scanner scan;
	public static void main(String[] args) throws IOException {
		 
		 scan = new Scanner(System.in);
		 BufferedReader reader = 
				 new BufferedReader (new InputStreamReader(System.in));
		 
		 String yesNo = "Y".trim();
		 
		 do {
			 System.out.println("Input Operator: ");
			 String operator = reader.readLine().trim();
			 
			 System.out.println("Input Operand 1: ");
			 int operand1 = scan.nextInt();
			 
			 System.out.println("Input Operand 2: ");
			 int operand2 = scan.nextInt();
			 
			 float sum = operand1 + operand2;
			 float diff = operand1 - operand2;
			 float prod = operand1 * operand2;
			 float quo = operand1 / operand2;
			 float rem = operand1 % operand2;
			 
			 switch (operator) {
				 case "+":
					 System.out.println("The summation of " + operand1 + " and " + operand2 + " is: " + sum);
					 break;
				 case "-":
					 System.out.println("The difference of " + operand1 + " and " + operand2 + " is: " + diff);
					 break;
				 case "*":
					 System.out.println("The product of " + operand1 + " and " + operand2 + " is: " + prod);
					 break;
				 case "/":
					 System.out.println("The quotient of " + operand1 + " and " + operand2 + " is: " + quo);
					 break;
				 case "%":
					 System.out.println("The remainder of " + operand1 + " and " + operand2 + " is: " + rem);
					 break;
				 default:
					 System.out.println("INVALID OPERATOR");
					 break;
			 }
			 			 
			 do {
				 System.out.println("Do you want to continue? [Y/N]: ");
				 yesNo = reader.readLine().trim();
				 break;				 
			 } while (yesNo.equalsIgnoreCase(yesNo));
			 			 
		 } while (yesNo.equalsIgnoreCase("Y"));
		 
		 System.out.println("\nThank you for using this application! ");
		 
	}

}
