package office_hour_vasyl_0606_OOP_2;

/*Create an abstract class named Movie that can be used with your video rental business. 
 The Movie class should track the Motion Picture Association of America (MPAA) rating 
 (for example, Rated G, PG-13, R), ID Number, movie title and director( use Director class) with appropriate accessor 
 and mutator methods (private instance variables, getters/setters). */
public abstract class Movie {
	private String rating;
	private int idNumber;
	private String title;
	private Director director; // this comes from Director class

//	Add a constructor that accepts four parameters. Constructor must initialize all instance variables of class Movie.
	public Movie(String rating, int idNumber, String title, Director director) {
//		super();
		this.rating = rating;
		this.idNumber = idNumber;
		this.title = title;
		this.director = director;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

//	Also create an equals() method that overrides Objects equals() method, where two movies are equal if their ID number is identical.
//	@Override
//	public boolean equals(Object o) {
//		Movie m = (Movie) o;  //casting, if we will not cast
//		return m.idNumber == this.idNumber;
//	}
	public boolean equals(Movie m) {
		// Movie m = (Movie) o; //casting, if we will not cast
		return m.idNumber == this.idNumber;
	}

	/*
	 * Finally, create abstract method named calcLateFees that takes as input the
	 * number of days a movie is late and returns the late fee for that movie.
	 * Action movies have a late fee of $3/day, comedies are $2.50/day, dramas are
	 * $2/day, horrors are $1.25/day and fantasy movies are $3.50/day
	 */
	public abstract double calcLateFees(int numberDays);

	/*
	 * Next, create four additional classes named Action, Comedy, Drama, Horror and Fantasy that are derived from Movie.
	 */

}
