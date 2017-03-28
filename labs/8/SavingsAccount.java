package lab8;

public class SavingsAccount extends Account {
	
	/** Constructor: Create default SavingsAccount */
	public SavingsAccount() {
		super();
	}
	
	/** Constructor: Create SavingsAccount with specified parameters */
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	/** Withdraw from savings account */
	public void withdraw(double withdrawAmount) {
		setBalance(getBalance() - withdrawAmount);
	}

}
