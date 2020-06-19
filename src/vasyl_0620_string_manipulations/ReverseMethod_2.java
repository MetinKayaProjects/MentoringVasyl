package vasyl_0620_string_manipulations;

import java.util.Arrays;

public class ReverseMethod_2 {
	public static void main(String[] args) {
		String target = "java";
		char[] arr = target.toCharArray();
		System.out.println(Arrays.toString(arr));  //[j, a, v, a]
		
		for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
			
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
