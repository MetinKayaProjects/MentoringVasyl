package office_hour_murodil_01;

import java.util.Arrays;

public class AddArrays {
	public static void main(String[] args) {
		int[] nums1 = {10, 20, 5, 3};
		int[] nums2 = {5, 1, 1, 4};
		
//		System.out.println(nums1[0] + nums2[0]); //10+5=15
//		declare new empty array with size of nums1
		int[] nums3 = new int[nums1.length];
		for (int i = 0; i < nums3.length; i++) {
			nums3[i] = nums1[i] + nums2[i];
		}
		System.out.println("nums1: "+ Arrays.toString(nums1));
		System.out.println("nums2: "+ Arrays.toString(nums2));
		System.out.println("nums3: "+ Arrays.toString(nums3));
	}
	/*
	 * add2Arrays
	 * returnType : int[]
	 * params: int[] nums1, int[] nums2
	 * add each value and assign to new array then return it
	 */

}
