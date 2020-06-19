package vasyl_day1;

import java.sql.Time;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time:");
		int time = input.nextInt();
		System.out.println((time < 18) ? "Good afternoon" : "Good evening");
		
		
//		String result = (time < 18) ? "Good afternoon" : "Good evening";
//		System.out.println(result);
		System.out.println();
		
		System.out.println("Enter the score : ");
		int score = input.nextInt();
	
		System.out.println((score>=64) ? "Passed" : "Failed");
	}

}
