package salih_unal;
import java.util.*;
public class IntegerPalindrome {


	
	//
	//	This program to check if number is palindrome or not.
	//	A number is called palindrome if number and its reverse is equal
	//

	
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Please enter number");
		
		int palindrome=scan.nextInt();
		
		
		if (isPalindrome(palindrome)) {
			
			
			System.out.println("Number : "+ palindrome+" is a palindrome");
			
		}else {
			
			System.out.println("Number : "+ palindrome+" is not a palindrome");
		}
		
	}
		
		public static boolean isPalindrome(int number) {
			
			int palindrome=number;
			
			int reverse=0;
			
			
			
			while(palindrome!=0) {
				
				int remainder=palindrome%10;
				
				reverse=reverse*10+remainder;
				
				palindrome=palindrome/10;
				
			}
			
			if(number==reverse) {
				
				return true;
			}
			
			return false;
			
		}
		
		
		
	}

