package vasyl_day1;

public class StringPractice {
public static void main(String[] args) {
	String word = "java";
	word.toUpperCase();
	System.out.println(word); // java printed since String is immutable. if you dont assign a new value you cannot printit out
	
	word = word.toUpperCase();
	System.out.println(word); // WORD since we assigned it to word
	
	//with new keyword
	
	String word2 = new String("java");
	word2 = word2.toUpperCase();
	System.out.println(word2); //JAVA
	System.out.println(word == word2); // false since word2 is a new String, not in the pool
	System.out.println(word.equals(word2)); //true. since values are same, but they are not in the same pool.
}
}
