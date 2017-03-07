package lab6;
import java.util.Date;

public class P97Account {
	/** Main Method */
	public static void main(String[] args) {
		// Create account with ID 1122, balance 20,000, annual interest rate 4.5%
		P97Account account = new P97Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		
		// Withdraw 2500 from account
		account.withdraw(2500);
		
		// Deposit 3000 to account
		account.deposit(3000);
		
		// Display balance, monthly interest, and creation date
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
		System.out.println("Date Created: " + account.getDateCreated());
		
		
	}
	
	// Initialize variables
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;
	
	/** Constructor: create default account */
	P97Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	/** Constructor: Create account with specified id and balance */
	P97Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	/**Method: Set ID */
	public void setId(int newId) {
		id = newId;
	}
	
	/** Method: Set Balance */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	/** Method set annual interest rate */
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	/** Method: Return id */
	public int getId() {
		return id;
	}
	
	/** Method: Return balance */
	public double getBalance() {
		return balance;
	}
	
	/** Method: Return annual interest rate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Method: Return date created */
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	/** Method: Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	/** Method: Return monthly interest */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	/** Method: Withdraw from account */
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	/** Method: Deposit to account */
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}

}
