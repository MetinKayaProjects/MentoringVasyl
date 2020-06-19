package office_hour_vasyl_0606_OOP_2;

/*
 * Finally, create abstract method named calcLateFees that takes as input the number of days a movie is late and returns the late fee for that movie. 
 Action movies have a late fee of $3/day, comedies are $2.50/day, dramas are $2/day, horrors are $1.25/day and fantasy movies are $3.50/day
 */
public class Action extends Movie {

	public Action(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);

	}

	@Override
	public double calcLateFees(int numberDays) {

		return numberDays * 3;
	}

}
