package payroll.utility;

public class Payroll {

	public boolean isInputNegative (int value) {
		return value < 0;
	}
	
	public static double computeGrossPay (int hrsWorked, int payRate) {
		return (hrsWorked * payRate);
	}
	
	public static double computeTaxDeduction (double grossPay) {
		double taxAmount = 0;
		if (grossPay < 5000) {
			System.out.println("Withholding Tax Deduction: PHP " + grossPay * 0.05);
		}
		else if (grossPay < 8000 && grossPay > 4999) {
			System.out.println("Withholding Tax Deduction: PHP " + grossPay * 0.07);
		}
		else if (grossPay < 10000 && grossPay > 7999) {
			System.out.println("Withholding Tax Deduction: PHP " + grossPay * 0.09);
		}
		else if (grossPay >= 10000) {
			System.out.println("Withholding Tax Deduction: PHP " + grossPay * 0.15);
		}
		else {
			System.out.println("Invalid Input");
		}
		return taxAmount;
	}
	
	public static double computeNetPay (double grossPay, double taxAmount, 
										double SSS, double HDMF) {
		return (grossPay - taxAmount - SSS - HDMF);
	}
	

}
