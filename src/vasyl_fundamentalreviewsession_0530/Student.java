package vasyl_fundamentalreviewsession_0530;

//Then write a subclass HighSchoolStudent containing:  (pls go to HighSchoolStudent class)

//Write a superclass Student that contains:
public class Student {
	private String school;
	
	//a constructor that accepts a String corresponding to the name of the school the student attends:
	public Student(String school) {
		this.school = school;
	}
//	a toString method that returns 'student at X' where X is the name of the school the student attends.
	@Override
	public String toString() {
		return "student at " + school;
	}
	
	

}
