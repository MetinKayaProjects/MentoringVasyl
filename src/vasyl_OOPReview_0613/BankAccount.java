package vasyl_OOPReview_0613;

// Define a class, BankAccount, that implements the above interface and has the following members: 

public class BankAccount implements Account {
	// - an instance variable named balance
	private int balance;

	// - a constructor that accepts an integer that is used to initialize the
	// instance variable
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//	public int getBalance() {
//		return balance;
//	}
	

	@Override
	public int deposit(int amount) {
// - an implementation of the deposit method that adds its parameter to the balance variable.
		balance += amount;
//		The new balance is returned as the value of the method. 
		return balance;
	}

	@Override
	public boolean withdraw(int amount) {
//		- an implementation of the withdraw method that checks whether its parameter is less than or equal to the balance and 
//		 if so, decreases the balance by the value of the parameter and returns true; otherwise, it leaves the balance unchanged and returns false.
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}
