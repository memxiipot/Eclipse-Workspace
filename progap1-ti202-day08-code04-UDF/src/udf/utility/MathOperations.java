package udf.utility;

public class MathOperations {

	
	public static int doAdd(int operand1, int operand2) {
		return (operand1 + operand2);
	}
	
	public int doSub(int operand1, int operand2) {
		return (operand1 - operand2);
	}
	
	public static int doMult(int operand1, int operand2) {
		return (operand1 * operand2);
	}
	
	public static int doDiv(int operand1, int operand2) {
		return (operand1 / operand2);
	}
	
	public float doRem(int operand1, int operand2) {
		return (operand1 % operand2);
	}
}
