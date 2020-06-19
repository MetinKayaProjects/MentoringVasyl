package vasyl_day1;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
//		write a program that will print season
//		based on the int value
//		value will be provided through the scanner
//		1 >> winter
//		6 >> summer
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int month = scan.nextInt();
	
//		if (month >=1 && month <= 2 || month == 12) {
//			System.out.println("Winter");
//		}else if(month >=3 && month <= 5) {
//			System.out.println("Spring");
//		}else if (month >= 6 && month <= 8) {
//			System.out.println("Summer");
//		}else if(month >=9 && month <=11){
//			System.out.println("Fall");
//		}else {
//			System.out.println("Invalid value");
//		}
		
		String message = "";	
//		switch (month) {
//			case 1:
//				message = "Winter";
//			break;
//			case 2:
//				message = "Winter";
//			break;
//			case 3:
//				message = "Spring";
//			break;
//			case 4:
//				message = "Spring";
//			break;
//			case 5:
//				message = "Spring";
//			break;
//			case 6:
//				message = "Summer";
//			break;
//			case 7:
//				message = "Summer";
//			break;
//			case 8:
//				message = "Summer";
//			break;
//			case 9:
//				message = "Fall";
//			break;
//			case 10:
//				message = "Fall";
//			break;
//			case 11:
//				message = "Fall";
//			break;
//			case 12:
//				message = "Winter";
//			break;
//
//		default:
//				message = "Invalid value";
//			break;
//		}
//		System.out.println(message);
//		
		
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			message = "Winter";
			break;
			
		case 3:
		case 4:
		case 5:
			message = "Spring";
		break;
		
		case 6:
		case 7:
		case 8:
			message = "Summer";
		break;
		
		case 9:
		case 10:
		case 11:
			message = "Fall";
		break;
	
	default:
			message = "Invalid value";
		break;
	}
		System.out.println(message);
		
		
	}

}
