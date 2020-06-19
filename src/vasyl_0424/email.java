package vasyl_0424;

public class email {
	public static void main(String[] args) {
		String email = generateEmail("James", "Bark");
		System.out.println(email);
		
		String email2 = generateEmail("Kaya", "metin", "yahoo");
		System.out.println(email2);
		
		System.out.println();
		String[] characters = {"Savannah Daniel", "Abby Green", "Velma Griffin", 
				"Veronica Cooper", "Milly Fitzpatrick"};
		
		for(String str : characters) {
//			1.
//			String name = str.split(" ")[0];
//			String lastName = str.split(" ")[1];
//			System.out.println(generateEmail(name, lastName));
			
//			 2.
			 String[] fullName = str.split(" ");
			 String name = fullName[0];
			 String lastName = fullName[1];
			 System.out.println(generateEmail(name, lastName));
			 /*
			savannah_daniel@gmail.com
			abby_green@gmail.com
			velma_griffin@gmail.com
			veronica_cooper@gmail.com
			milly_fitzpatrick@gmail.com
			 */
			 
			 System.out.println(foramtName("Bugs Bunny"));;
		}
		
	}

	public static String generateEmail(String firstName, String lastName) {

		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
	}

	public static String generateEmail(String firstName, String lastName, String domain) {

		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@" + domain + ".com";
	}
	public static String foramtName(String str) {
		// it will capitalize first character
		//and it will turn all other characters into lower case
		str = str.trim();
		if (str.isEmpty()) {
			return "NAme is too short";
		}else if (str.contains(" ")) {
			String[] values = str.split(" ");
			String result = "";
			for(String value : values) {
				result = result + value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase() + " ";
			}
			return result.trim();
		}
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
