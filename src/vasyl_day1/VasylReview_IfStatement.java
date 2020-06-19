package vasyl_day1;

import java.util.Scanner;

public class VasylReview_IfStatement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an age: ");
		int age = scan.nextInt();
		if (age < 21) {
			System.out.println("Under age!");
		}else {
			System.out.println("You are eligible");
		}
		
		
		
		
		
		
		
	}

}
