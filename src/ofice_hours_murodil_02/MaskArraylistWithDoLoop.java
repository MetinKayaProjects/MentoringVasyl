package ofice_hours_murodil_02;
import java.util.*;
public class MaskArraylistWithDoLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>();
        List<String> masked = new ArrayList<>();
        List<Integer> lengthsList =new ArrayList<>();
        
        String answer="";
        do {
            System.out.println("Enter word");
            String word = scan.next(); //hello
            inputs.add(word);//hello
            masked.add(maskWord(word));
            lengthsList.add(word.length());
            System.out.println("You want to add another word?");
            answer = scan.next();
        }while(answer.equalsIgnoreCase("yes"));
        
        
        
        System.out.println(inputs.toString());
        System.out.println(masked.toString());
        System.out.println(lengthsList.toString());
        
        
        
    }
    
    /*
     * maskWord
     * return: String
     * params: String word
     * it will convert each character into * in the work and
     * return. Length of word and * must match
     */
    public static String maskWord(String word) {
        String stars ="";
        for(int i = 1; i <= word.length(); i++) {
            stars += "*";
        }
        return stars;
    }
    
    
    
    
    
    
    
    
    
}
