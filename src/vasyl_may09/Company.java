package vasyl_may09;
import java.util.*;
public class Company {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		// first employee
		employee1.firstName = "Pavel";
		employee1.lastName = "Babayan";
		employee1.gender = 'M';
		employee1.isInsured = true;
		employee1.printInfo();

		// second employee
		Employee employee2 = new Employee();
		employee2.firstName = "Murad";

		employee1.generateEmail();
		employee1.printEmail();
		employee1.setEmail("324234@");
		employee1.email = "newemail@gmail.com";
		employee1.title = "developer";
		employee1.setJobTitle("Carwasher");
		employee1.printInfo();
	}
}

// Employee[] it_department = new Employee[2];
// type[] name = new type[size];
// Employee[] it_department = { employee1, employee2 };