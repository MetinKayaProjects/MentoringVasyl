package office_hour_vasyl_0606_OOP;

public class BankAccount {
	/*Write a class, BankAccount, containing:
		instance variables: name (String), balance (double). 
		a constructor accepting a String corresponding to the name of the account holder.
		a method, getBalance, that returns a double corresponding to the account balance.
		a method withdraw that accepts a double, and deducts the amount from the account balance.*/
	
	String name; 
	double balance;
	
	
	public BankAccount(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
	public double withdraw(double amount) {
		return balance -= amount;
	}
	
	public double deposit(double amount) {
		return balance =+ amount;
	}
	
	public String toString() {
		return "Bank account [name= ]" + name + "]" + "balance= " + balance;
	}
	
	

}
