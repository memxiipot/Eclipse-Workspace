package payroll.function;

import payroll.reader.Reader;
import payroll.utility.Payroll;

public class PayrollFunction {
	
	public static void main(String[] args) {
		
		int hrsWorked = Reader.readInt("Hours Worked");
		int payRate = Reader.readInt("Hourly Rate");
		double grossPay = Payroll.computeGrossPay(hrsWorked, payRate);
		double taxAmount = Payroll.computeTaxDeduction(grossPay);
		double SSS = 1000;
		double HDMF = 500;
		double netPay = Payroll.computeNetPay(grossPay, taxAmount, SSS, HDMF);
		
		System.out.println("Grosspay: PHP " + grossPay);
		System.out.println("SSS Deduction: PHP " + SSS);
		System.out.println("HDMF Reduction: PHP " + HDMF);
		System.out.println("Net Pay: " + netPay);
				
	}

}
