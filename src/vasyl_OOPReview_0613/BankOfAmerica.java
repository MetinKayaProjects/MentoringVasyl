package vasyl_OOPReview_0613;

import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class BankOfAmerica {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(5000);
		//Polimorphism: REferenace type is an interface and object type is defiirent
		Account account2 = new BankAccount(10000);
		
		System.out.println(account1 instanceof Account);//true
		System.out.println(account2 instanceof Account);//true
		
		System.out.println(account1.deposit(250)); // 5000+250
		System.out.println(account2.deposit(250)); // 10000+250
		
		System.out.println(account1.withdraw(100)); //true
		
//		account1.setBalance(2000);
//		System.out.println(account1.getBalance());
		
		System.out.println("-----");
		PayPal pp = new PayPal(125, "sdet@gamil.com", "12345");
		
//						System.out.println(pp.deposit(1000));
//						Sending email to: sdet@gamil.com
//						Email: Your balance was increased by: 1000
//						Current balance is : 1000
//						1000
		Account pp2 = new PayPal(100, "develop@gmail.com", "321345678");
		
		System.out.println(pp2.withdraw(50));
//					Sending email to: develop@gmail.com
//					Email: You paid: 50
//					Current balance is : 50
//					true
		ArrayList<Account> myAccounts = new ArrayList<>();
		myAccounts.add(account1);
		myAccounts.add(account2);
		myAccounts.add(pp);
		myAccounts.add(pp2);
		
		System.out.println();
		
		for(Account ac : myAccounts) {
			System.out.println(ac);  //or ac.toString
		}
		
		
	}

}
