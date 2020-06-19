package ofice_hours_murodil_02;
import java.util.*;
public class MaskArrayList {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	List<String> inputs = new ArrayList<String>();
	List<String> masked = new ArrayList<String>();
	List<Integer> lengthList = new ArrayList<Integer>();
	
	System.out.println("Enter word");
	String word = scan.next();  // hello
	inputs.add(word);  //hello
	System.out.println(maskWord(word));
	//to add into maked ArrayList
	masked.add(maskWord(word));
	//tolengthList
	lengthList.add(word.length());
	
	System.out.println(inputs.toString());
	System.out.println(masked.toString());
	System.out.println(lengthList.toString());
	
	}	
	
	/*
	 * method : maskWord
	 * return: String
	 * params: String word
	 * it will convert each character into * in the work and return.
	 * Length of word and * must match
	 */
	public static String maskWord(String word) {
		String stars = "";
		
		for (int i = 0; i < word.length(); i++) { // we dont deal with index, we interest in length
			stars += "*";
			
		}return stars;
	}

}
