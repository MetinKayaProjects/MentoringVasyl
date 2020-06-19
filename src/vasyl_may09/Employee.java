package vasyl_may09;
import java.util.*;;
public class Employee {
	// instance variables
		String firstName;
		String lastName;
		int employee_id;
		int age;
		float hourlyRate;
		char gender;
		boolean isInsured;
		String title;
		String email;
		String[] titles = {"Developer", "Scrum master", "SDET", "PO", "QA Analyst", "BA", "HR"};

		/// instance method
		public void printInfo() {
			System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
					+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
					+ ", Title: " + title + ", Email: " + email);
		}

		// let's create a method that will generate an email for employee
		// use firstname_lastname@gmail.com as a template
		// your method suppose to accept object of employee as a parameter (Employee e)
		// and this method will have a String as return type

		public String generateEmail() {
			//we are creating new email
			String newEmail = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
			email = newEmail;
			return newEmail;
		}

		public void setEmail(String e) {
			//let's check if email is valid
			//before changing it 
			if(e.contains("@")) {
				email = e;
			}else {
				System.out.println("Invalid email!");
			}
		}

		public void printEmail() {
			System.out.println("Email of " + firstName + " " + lastName + " : " + email);
		}
		
		//this method will validate title before setting it 
		public void setJobTitle(String str) {
			//by default it's false
			boolean isValid = false;
			for(String t: titles) {
				if(t.equals(str)) {
					//if we verified that title is valid
					//then we will set this title
					title = str;
					//and isValid will become a true
					//it will set to true, only if this condition is true: t.equals(str)
					isValid = true;
				}
			}
			//if(isValid = true) --> 
			if(isValid == true) {
				System.out.println("Title was set successfully.");
			}else {
				// it isValid false, that means str (title) is no in a list
				System.out.println("Invalid title!");
			}
		}

	}