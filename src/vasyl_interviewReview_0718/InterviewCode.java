package vasyl_interviewReview_0718;

import java.util.Arrays;

public class InterviewCode {
	public static void main(String[] args) {
		// write a method that will calculate sum of all digits
		int num = 1119;
		// %10 will always return last digit
		// System.out.println(435%10);
		// System.out.println(435/10%10);
		// System.out.println(435/10/10%10);
		System.out.println(sumDigits(num));
		System.out.println(1 / 10);
		System.out.println(reverseInteger(1234));
		int array[] = {12,1,4, 123, 14};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(addItemIntoArray(array, 5, 1)));
	}

	/**
	 * 
	 * calculate sum of digits
	 * 
	 * @param num
	 * @return sum of digits
	 */
	public static int sumDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10; // to get last digit
			num = num / 10; // to get rid off last digit
		}
		return sum;
	}

	// reverse integer without converting it into string.

	public static int reverseInteger(int num) {
		int reverse = 0;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10; // to get last digit
			reverse = reverse * 10 + remainder; // concat digits
			num = num / 10; // to get rid off last digit
		}
		return reverse;
	}

	// write a method that can add number into
	// array under specific position.
	public static int[] addItemIntoArray(int[] arr, int num, int position) {
		int[] newArr = new int[arr.length + 1];
		for (int i = 0, j =0; i < newArr.length; i++) {
			if (i == position) {
				newArr[i] = num;		
			} else {
				newArr[i] = arr[j];
				j++;
			}
		}
		return newArr;
	}
	
	public static String reverseString(String str) {
		String reverse= "";
		for(int i = str.length()-1; i >=0; i--) {
		reverse += str.charAt(i);
		}
		return reverse;
		}
	
	
	public void printReverse(char[] letters, int size){
		for (int i = letters.length-1; i >= 0 ; i--){
		System.out.print(letters[i]);
		}
		}
	
	//prime number
	public static boolean checkPrime(int n) {
		if (n <= 1) {
		return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
		if (n % i == 0) {
		return false;
		}
		}
		return true; }
	
	//Palindrome
	public static boolean isPalindrome(String str) {
	if(str == null)
	return false;
	StringBuilder sb = new StringBuilder(str);
	return sb.reverse().toString().equals(str); }
	
	
//	Palindrome – with charAt()
	public static boolean isPalindrome2(String s) {
	int head = 0;
	int tail = s.length() - 1;
	while (head < tail) {
	if (s.charAt(head) != s.charAt(tail)) {
	return false;
	}
	head++;
	tail--;
	}
	return true; }
	
	//Reverse String – ArrayList – Itirator
//	public static void main(String[] args){
//	String input = "Geeks For Geeks";
//	List<Character> arrList = new ArrayList<>();
//	for (char c: input.toCharArray()){
//	arrList.add(c);
//	}
//	Collections.reverse(arrList);
//	Object[] arr2 = arrList.toArray();
//	for(int i = 0; i <arr2.length; i++) {
//	reverse += arr2[i];
//	}
//	System.out.println(reverse);
//	}
	
	//ANOTHER WAY
//	String reverse = arrList.stream() // Stream<Character>
//	.map(String::valueOf) // Stream<String>
//	.collect(Collectors.joining());
	
//	Factorial
//	int number = 10;
//	int factorialSum = 1;
//	for(int i = 1 ; i <=number; i++) {
//	factorialSum = factorialSum * i;
//	}
//	System.out.println("Factorial of " + number + " is " + factorialSum); }


}
