package vasyl_OOPReview_0613;
//Create an interface, Account, with the following methods: 
//- deposit: accepts an integer parameter and returns an integer 
//- withdraw: accepts an integer parameter and return a boolean 

public interface Account {
	
	public int deposit(int amount);
	
	public boolean withdraw(int amount);

}
