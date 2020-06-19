package office_hour_maaruf_2;

public class Employees {
	public static void main(String[] args) {

		EmailGenerator e1 = new EmailGenerator("Roman");

		System.out.println(e1.getEmail());// Roman@Deloitte.com
		e1.name = "metin";
		System.out.println(e1.name = "metin");
		System.out.println(e1.getEmail());// metin@Deloitte.com

		EmailGenerator e2 = new EmailGenerator("Florian");
		System.out.println(e2.getEmail());

		EmailGenerator.companyName = "Amazon";// company name'i degistirdik
//	EmailGenerator.name  // olma . since name is nonstatic
		
		// both object(e1 and e2) will have new companyName in the email.
		System.out.println(e2.getEmail());// Florian@Amazon.com
		System.out.println(e1.getEmail());// metin@Amazon.com

		e1.name = "Ali";
		e2.name = "Hasan";

		System.out.println(e1.getEmail());// Ali@Amazon.com
		System.out.println(e2.getEmail());// Hasan@Amazon.com

	}

}
