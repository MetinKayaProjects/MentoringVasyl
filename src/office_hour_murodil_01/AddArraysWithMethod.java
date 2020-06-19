package office_hour_murodil_01;

import java.util.Arrays;

public class AddArraysWithMethod {
	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 5, 3 };
		int[] nums2 = { 5, 1, 1, 4 };
		
		int[] nums3 = add2Arrays(nums1, nums2); //nums3 yerine newArray desek mesela line 20'de de nums3 yerine newArray yazilir.

//		System.out.println(nums1[0] + nums2[0]); //10+5=15
//		//declare new empty array with size of nums1
		
//		int[] nums3 = new int[nums1.length];
//		for (int i = 0; i < nums3.length; i++) {
//			nums3[i] = nums1[i] + nums2[i];
//		}
		
		System.out.println("nums1: " + Arrays.toString(nums1));
		System.out.println("nums2: " + Arrays.toString(nums2));
		System.out.println("nums3: " + Arrays.toString(nums3));
		
		System.out.println();
		
		String[] first = {"cybertek" , "java", "student", "mentor"};
		String[] second = {"100", "001", "five", "best"};
		
		String[] third = add2Arrays(first, second);
		
		System.out.println("first " + Arrays.toString(first));
		System.out.println("second " + Arrays.toString(second));
		System.out.println("third " + Arrays.toString(third));
	}

	/*
	 * add2Arrays returnType : int[] params: int[] nums1, int[] nums2 add each value
	 * and assign to new array then return it
	 */
	public static int[] add2Arrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length];
		for (int i = 0; i < nums3.length; i++) {
			nums3[i] = nums1[i] + nums2[i];
		}
		return nums3;
	}
	public static String[] add2Arrays(String[] str1, String[] str2) {
		String[] newOne = new String[str1.length];
		for (int i = 0; i < str1.length; i++) {
			newOne[i] = str1[i] + "-" + str2[i];
		}return newOne;
	}

}
