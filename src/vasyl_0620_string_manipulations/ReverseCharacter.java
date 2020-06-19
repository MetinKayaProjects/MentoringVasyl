package vasyl_0620_string_manipulations;

import java.util.Arrays;

public class ReverseCharacter {
	  public static void main(String[] args) {
	        String target = "_+!ap4ple-";
//	      String expected = "_+!elppa-";
	        System.out.println(reverseLetters(target));
	    }
	    
	    public static String reverseLetters(String str) {
	        //convert string into array of chars
	        //because string is immutable
	        //so it's easier to swap values with array
	        char[] arr = str.toCharArray();
	        //i starts from he beginning 
	        // j starts from the end
	        for(int i=0, j = arr.length-1; i<j; i++, j--) {
	            //until character under position i is not a letter
	            //it will keep moving
	            while(!Character.isLetter(arr[i])) {
	                i++;
	            }
	            //until character under position j is not a letter
	            //it will keep moving
	            while(!Character.isLetter(arr[j])) {
	                j--;
	            }
	            //once we have letter from left side and from the right side
	            //we can swap them
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        //convert array of chars into string
	        String result = new String(arr);
	        return result;
	    }
	}