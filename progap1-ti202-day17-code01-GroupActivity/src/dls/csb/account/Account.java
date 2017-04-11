package dls.csb.account;

public class Account {

    public double balance;  //The current balance
    public int accountNum;  //The account number    
    
    public Account(int accountNum) {    
	balance = 0.0;
	this.accountNum = accountNum;
    }
    
    public void deposit(double sum) {
	if (sum > 0)
	    balance += sum;    
	else
	    System.err.println("Account.deposit(...): cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum) {
	if (sum > 0)
	    balance -= sum;    
	else
	    System.err.println("Account.withdraw(...): cannot withdraw negative amount.");    
    }
    
    public double getBalance() {
	return balance;
    }
    
    public double getAccountNumber() {
	return accountNum;
    }
    
    public String toString() {
	return "Account " + accountNum + ": " + "balance = " + balance;    
    }
    
    public final void print() {
	System.out.println( toString() );    
    }    
    
    
    
}
