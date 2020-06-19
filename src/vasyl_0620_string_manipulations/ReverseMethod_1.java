package vasyl_0620_string_manipulations;

import java.util.Arrays;

public class ReverseMethod_1 {
	public static void main(String[] args) {
		
		String target = "apple";
		String expected = "elppa";
		String actualResult = reverse(target);
		System.out.println(reverse(target));
		
		if (reverse(target).equals(expected)) {
			System.out.println("P A S S E D.................");
			System.out.print("Expected result: " + expected + " is same with ");
			System.out.println("Actual result: " + actualResult);
		}else {
			System.out.println("Failed");
			System.out.println("Expected result: " + expected);
			System.out.println("Actual result: " + actualResult);
		}
		
	}
	
	//method-1
//	public static String reverse(String str) {
//		
//		String result= "";
//		for (int i = str.length()-1; i >=0; i--) {
//		result += str.charAt(i);	
//		}
//		
//		return result;
//	}
	
	//method-2
	public static String reverse(String str) {
		char[] arr = str.toCharArray();
		char[] newArr = new char[arr.length];
		int idx = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			newArr[idx] = arr[i];
			idx++;
			
		}
		return (new String (newArr));
	
		
//		String str2 = "";
//		for(char strNew : newArr) {
//			str2 += strNew;
//		}
//		return str2;
		
	}
	
	//method-3
//	 public static String reverse(String str) {
//	        char[] arr = str.toCharArray();
//	        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
//	            System.out.println(Arrays.toString(arr));
//	            char temp = arr[i];
//	            arr[i] = arr[j];
//	            arr[j] = temp;
//	        }
//	        return new String(arr);
//	    }

}
