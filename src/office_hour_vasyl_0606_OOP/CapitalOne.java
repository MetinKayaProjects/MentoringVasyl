package office_hour_vasyl_0606_OOP;

public class CapitalOne {
	public static void main(String[] args) {
		
		CheckingAccount account1 = new CheckingAccount("John Smith", true);
		System.out.println(account1);//Bank account [name= ]John Smith]balance= 0.0
//		System.out.println(account1.toString()); // same w/ above
		
		System.out.println(account1.getBalance()); //0.0
		account1.deposit(1000);
		System.out.println(account1.getBalance()); //1000.0
		
		account1.clearCheck(500);
		System.out.println(account1.getBalance()); //500.0
		
		System.out.println(account1.hasOverdraft());//true
		
		System.out.println(account1.withdraw(5000));
		System.out.println(account1.clearCheck(6000));
		
	}

}
