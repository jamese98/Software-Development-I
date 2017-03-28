package lab8;

public class CheckingAccount extends Account {
	// Initialize data vars
	private double overdraftLimit;
	
	/** Constructor: Create default checking account */
	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}
	
	/** Constructor: Create checking account with specified input */
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	/** Method: Set overdraft limit */
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	/** Method: Get overdraft limit */
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	/** Method: Withdraw from checking account */
	public void withdraw(double withdrawAmount) {
		setBalance(getBalance() - withdrawAmount);
	}
	
	/** Method: Checking account details to string */
	public String toString() {
		return super.toString() + 
			   "\nOverdraft Limit: $" +
				overdraftLimit;
	}

}
