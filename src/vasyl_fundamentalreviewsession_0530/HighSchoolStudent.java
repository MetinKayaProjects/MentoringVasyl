package vasyl_fundamentalreviewsession_0530;

//Then write a subclass HighSchoolStudent containing:
public class HighSchoolStudent extends Student {

//	a constructor accepting a String which is used as a parameter to the superclass constructor

	public HighSchoolStudent(String school) {
		super(school);  //super(variable)
	}
//	a toString method that returns 'high school student at X'. This method must use the toString method of its superclass.

	public String toString() {
		return "High school " + super.toString();  //super.object
	}
}
