package payroll.utility;

public class Payroll {

	public boolean isInputNegative(int input) {
		return (input > 0)?true:false;		
	}
	public double computeGrossPay(int hoursWorked, int payRate) {
		return (hoursWorked * payRate);
	}

	public double computeTaxDeduction(double grossPay) {
		double taxDeductionTotal = 0;
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
		return taxDeductionTotal;
	}

	public double computeNetPay(double grossPay, double taxAmount, double SSS, double HDMF) {
		return (grossPay - taxAmount - SSS - HDMF);
	}
	
}
