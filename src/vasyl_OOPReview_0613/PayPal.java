package vasyl_OOPReview_0613;

public class PayPal implements Account {
	private int balance;
	private String email;
	private String password;

	public PayPal(int balance, String email, String password) {
		this.balance = balance;
		this.email = email;
		this.password = password;
	}

	@Override
	public int deposit(int amount) {
	
		balance += amount;
		sendEmail(this.email,"Your balance was increased by: "+ amount + "\nCurrent balance is : " + balance); 
		return balance;
	}

	@Override
	public boolean withdraw(int amount) {

		if (amount <= balance) {
			balance -= amount;
			sendEmail(this.email,"You paid: "+ amount + "\nCurrent balance is : " + balance);
			return true;
		}
		sendEmail(this.email,"Your balance is low: "+ balance + "\nYour balance is not available to withdraw : " + amount);
		return false;
	}
	
	public void sendEmail(String emailResiever, String message) {
		System.out.println("Sending email to: " + emailResiever);
		System.out.println("Email: " + message);
	}

	@Override
	public String toString() {
		return "PayPal [balance=" + balance + ", email=" + email + ", password=" + password + "]";
	}

}
