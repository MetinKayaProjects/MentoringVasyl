package office_hour_maaruf;

import java.util.*;

public class CreatePeopleHere {
	public static void main(String[] args) {

		// when we use constructors certain actions are being taken during the process
		// of creating the object
		Person john = new Person("01/01/2000", "Ali", "Cig"); // constructor ile birlikte setBirthday'i sildik. artik
																// kimse set ile
		// disaridan girde/degisiklik yapamaz
		System.out.println(john.toString());
		System.err.println(john.getBirthday());
		john.setFirstName("John");
		john.setLastName("Doe");
		// john.setBirthday("01/01/2000"); //constructor yazdik, gerek kalmadi

		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());

		john.setLastName("Smith");
		// john.setBirthday("02/02/2000"); //setter'i sildigimiz icin degisiklik
		// yapilamaz.

		System.out.println(john.getBirthday());

	}

}
