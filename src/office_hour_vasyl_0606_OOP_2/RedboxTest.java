package office_hour_vasyl_0606_OOP_2;

public class RedboxTest {
	public static void main(String[] args) {
		Director director1 = new Director("Anthony Russo");
		Director director2 = new Director("Bradley Cooper");
		
		Fantasy avangers = new Fantasy("PG-13", 1, "Avengers: Endgame", director1);
		
		Drama astarisborn = new Drama("R", 2, "A Star Is Born", director2);
		System.out.println(avangers.calcLateFees(5));
		System.out.println(astarisborn.calcLateFees(5));
		
		Fantasy avangers2 = new Fantasy("PG-3", 1, "Avengers", director1);
		System.out.println(avangers.equals(avangers2));
		System.out.println(avangers.toString());
		
	}

}
