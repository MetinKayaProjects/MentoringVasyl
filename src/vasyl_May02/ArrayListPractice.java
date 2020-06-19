package vasyl_May02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
	 public static void main(String[] args) {
	        int[] nums = new int[4];
	        nums[0] = 23;
	        System.out.println(Arrays.toString(nums));
	        ArrayList<Integer> nums2 = new ArrayList<>();
	        nums2.add(23);
	        nums2.add(100);
	        nums2.add(125);
	        nums2.add(600);
	        nums2.add(2, 65);//2 means position, 65 value that will be under this position
	        System.out.println(nums2);
	        System.out.println("How many elemnts in array list? "+nums2.size());
	        //auto boxing helps us to convert primitive into object
	        //if we enter number into remove() method, it will treat this number as index (position)
	        Integer numToDelete = 600;
	        nums2.remove(numToDelete);
	        System.out.println(nums2);
	        
	        
	    }

}
