package vasyl_array_0419;

import java.util.Arrays;

public class ArraysNums {
	public static void main(String[] args) {
		  int[][] nums = { { 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
	                { 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
	                { 22342, 343, 3453245, 34534, -567, 73, 345, 4563657, } };
	        // outer loop
	        // that is changing rows
	        int maximum = nums[0][0];
	        int minimum = nums[0][0];
	        int countPositive = 0;
	        int countNegative = 0;
	        int total = 0;
	        for (int rows = 0; rows < nums.length; rows++) {
	            // inner loop
	            // changing column
	            // nums[rows].length means length of specific array
	            // if rows = 0, then it's gonna be length of 1st array
	            for (int columns = 0; columns < nums[rows].length; columns++) {
	                if (nums[rows][columns] > maximum) {
	                    maximum = nums[rows][columns];
	                }
	                if (nums[rows][columns] < minimum) {
	                    minimum = nums[rows][columns];
	                }
	                // if number is grater than 0 - it's positive
	                if (nums[rows][columns] > 0) {
	                    countPositive++;
	                    // if number is less than 0 - it's negative
	                } else if (nums[rows][columns] < 0) {
	                    countNegative++;
	                }
	                //to find total
	                total += nums[rows][columns];
	            }
	        }
	        System.out.println("Minimum: " + minimum);
	        System.out.println("Maximum: " + maximum);
	        System.out.println("How many positive: " + countPositive);
	        System.out.println("How many negative: " + countNegative);
	        System.out.println("Total: "+total);

	}

}
