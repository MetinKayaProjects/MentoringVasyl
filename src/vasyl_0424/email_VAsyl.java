package vasyl_0424;

public class email_VAsyl {
	 public static void main(String[] args) {
	        String email = generateEmail("James", "Bark");
	        String email2 = generateEmail("Peter", "Foster", "cybertekschool");
//	      System.out.println(email);
//	      System.out.println(email2);
	        ///// BREAK TILL 6:13
	        String[] characters = {"Savannah Daniel", "Abby Green", "Velma Griffin",
	                                "Veronica Cooper", "Milly Fitzpatrick"};
//	      for(String str: characters) {
////	            1. str = Savannah Daniel, 2.  str = Abby Green....
////	            str.split(" ") -- > {"Savannah", "Daniel"} 
////	            String name = str.split(" ")[0];
////	            String lastName = str.split(" ")[1];
//	          String[] fullName = str.split(" ");
//	          String name = fullName[0];
//	          String lastName = fullName[1];
//	          System.out.println(generateEmail(name, lastName));
//	      }
	        
	        System.out.println(foramtName("bugs bunny"));
	        
	        System.out.println("Underage? " +underage(11));
	        
	        
	    }
	    //this method takes only 2 parameters
	    public static String generateEmail(String firstName, String lastName) {
	        return firstName.toLowerCase() +"_"+lastName.toLowerCase()+"@gmail.com";        
	    }
	    ///this method takes 3 parameters
	    public static String generateEmail(String firstName, String lastName, String domain) {
	        return firstName.toLowerCase() +"_"+lastName.toLowerCase()+"@"+domain+".com";     
	    }
	    
	    public static String foramtName(String str) {
	        //it will capitalize first character
	        //and it will turn all other characters into lower case
	        //we removing spaces from left and right
	        str = str.trim();
	        if(str.isEmpty()) {
	            //this case for empty string,
	            //or invalid name
	            return "Name is too short!";
	        }else if(str.contains(" ")) {
	            //this case is for multiple values
	            //we are creating an array of strings
	            // {"bugs", "bunny"}
	            String[] values = str.split(" ");
	            String result = "";
	            for(String value: values) {
	                // 1. bugs -- > B + ugs -- > Bugs 
	                // 2. bunny --> B + unny --> Bugs Bunny
	                result =  result + value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase()+" ";
	            }
	            //Bugs Bunny 
	            return result.trim();
	        }
	        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	    }
	    public static boolean underage(int age) {
	    	return age < 21;
	    }

}
