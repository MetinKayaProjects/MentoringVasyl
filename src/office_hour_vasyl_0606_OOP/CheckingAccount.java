package office_hour_vasyl_0606_OOP;

public class CheckingAccount extends BankAccount{
	/*Write a class definition for a subclass, CheckingAccount, that contains:
a boolean instance variable, overdraft. 
(Having overdraft for a checking account allows one to write checks larger than the current balance).
a constructor that accepts a String and a boolean.*/
	
	private boolean overdraft;

	public CheckingAccount(String name, boolean overdraft) { //a constructor that accepts a String and a boolean
//		The String parameter is used in the invocation of the superclass (BankAccount) constructor, 
		super(name);
//		while the boolean is used to initialize the overdraft instance variable.
		this.overdraft = overdraft;
	}
//	a method, hasOverdraft, that returns a boolean. hasOverdraft returns true if the account supports overdraft.
	public boolean hasOverdraft() {
		return (overdraft == true)? true :  false;
		//return overdraft;
	}
	
	/*a method, clearCheck, that accepts a double and returns a boolean. clearCheck will determine if the amount (of the check) can be cashed-- 
this will be the case if the amount is less than the balance in the account, or if the account allows overdraft. 
If the check can be cashed, clearCheck returns true, and also calls the withdraw method to update the account balance; otherwise, clearCheck returns false.*/
	
	public boolean clearCheck(double amount) {
		if (amount < getBalance() || overdraft) {
			super.withdraw(amount); //calls the withdraw method to update the account balance
			return true;
		
			
		}else {
			System.out.println("Not enough credit");
			return false;
		}
	}

}
