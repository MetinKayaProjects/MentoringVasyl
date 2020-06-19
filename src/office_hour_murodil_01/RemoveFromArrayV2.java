package office_hour_murodil_01;

import java.util.Arrays;

public class RemoveFromArrayV2 {
	public static void main(String[] args) {
		
		int[] nums = { 1, 3, 1, 4, 1, 6 };
		int target = 1; // need to remove all 1s from nums
		// find out how many targets are in nums
		int counter = 0;
		// loop and using if condition, increase counter for each match
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				counter++;
			}
		}
		System.out.println(counter); // 3 is the number shows that array length after removing 1s

		// declare new empty array with size that
		// does not include target count
		int[] newArray = new int[nums.length - counter];
		// loop nums one more time and add all values that are not target
		int idx = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != target) {
				newArray[idx] = nums[j];
				idx++;
			}
		}
		
		System.out.println(Arrays.toString(nums)); // [1, 3, 1, 4, 1, 6]
		System.out.println(Arrays.toString(newArray)); // [3, 4, 6]

	}
	

}
