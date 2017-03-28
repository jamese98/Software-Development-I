package lab8;

public class P11_3 {

	public static void main(String[] args) {
		// Create account objects
		Account account = new Account(1000, 20000);
		SavingsAccount savings = new SavingsAccount(2000, 30000);
		CheckingAccount checking = new CheckingAccount(3000, 40000, -20);
		
		// Set annual interest rate for each account
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);
		
		// Withdraw 2500 from each account
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);
		
		// Deposit 3000 from each account
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);
		
		// Call toString methods to display results
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());

	}

}
