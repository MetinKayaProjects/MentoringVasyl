package vasyl_array_0419;

import java.util.Arrays;

public class ArraysNumsOrder {
	public static void main(String[] args) {
		
		 int[][] nums = { { 123, 532, 34, 643, -345, 73, 436, 344362, 547 },      //rows-1
	                { 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },  //rows-2
	                { 22342, 343, 3453245, 34534, -567, 73, 345, 4563657, } };    //rows-3
		
		 System.out.println(Arrays.deepToString(nums));
//		 [[123, 532, 34, 643, -345, 73, 436, 344362, 547], 
//		 [12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576], 
//		 [22342, 343, 3453245, 34534, -567, 73, 345, 4563657]]

		System.out.println("numbers of rows: " + nums.length);  //3 >> numbers of rows
		System.out.println("1st row's length: " + nums[0].length);
		System.out.println("2nd row's length: " + nums[1].length);
		System.out.println("3rd row's length: " + nums[2].length);
		
		 for (int rows = 0; rows < nums.length; rows++) {
			 System.out.print("rows " + (rows+1) + " # ");
			 for (int columns = rows; columns < nums[rows].length; columns++) {
				System.out.print(nums[rows][columns]+" ");
				
			}System.out.println();
		}System.out.println();
		 
		 
		 
	}

}
