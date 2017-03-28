package lab8;
import java.util.Date;

public class Account {

	// Initialize variables
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;
	
	/** Constructor: create default account */
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	/** Constructor: Create account with specified id and balance */
	Account(int newId, double newBalance) {
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
	
	/** Method: Output account details as String */
	public String toString() {
		return "\nAccount ID: " + id + 
			   "\nBalance: $" + balance +
			   "\nMonthly Interest: $" + getMonthlyInterest();
	}

}
