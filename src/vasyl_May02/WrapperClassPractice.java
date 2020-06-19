package vasyl_May02;

public class WrapperClassPractice {
	public static void main(String[] args) {

		int num = 10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);

		System.out.println(num == num2); // true
		System.out.println(num == num3); // true
//		intValue() will return the actual value
		System.out.println(num2.intValue() == num3.intValue()); // true

//		contains the same int value as this object
		System.out.println(num2.equals(num3)); // true
		num2 = num3;
		System.out.println(num2 == num3); // true

//		how to convert text into number?
		String age = "25"; // age as assigned as String
//		1st way to convert to int
		int agenum = Integer.parseInt(age);
//		1st way to convert to int
		int agenum2 = Integer.valueOf(age);

		if (agenum > 21) {
			System.out.println("Youa are fine");
		} else {
			System.out.println("under age");
		}
		
		String text = "Wind: 5 mph";
        //let's create if statement in order to determine if wind is safe
        //if speed is more than 30 mph print: You are in danger!
        //Otherwise, print: "You are safe!"
		
		//step-1: get te speed from String:
		String speed = text.substring(text.lastIndexOf(':')+2, text.lastIndexOf(" "));
		System.out.println("Speed : " + speed);
		
		//step-2: convert to integer
		int convertedSpeed = Integer.parseInt(speed);
//		int convertedSpeed = Integer.valueOf(speed);
		
		if (convertedSpeed < 30) {
			System.out.println("You are safe");
			
		}else {
			System.out.println("You are in danger");
		}
		
		

	}

}
