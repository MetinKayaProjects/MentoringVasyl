package vasyl_fundamentalreviewsession_0530;

public class SchoolTest {
	public static void main(String[] args) {
		
	HighSchoolStudent student1	= new HighSchoolStudent("Marshall High School");
//step1	first goes to :HighSchoolStudent extends Student
	
//	public HighSchoolStudent(String school) {
//		super(school);  //super(variable)
//	}
	
//step2	from here super(school) takes it to : public class Student:
//	public Student(String school) {
//		this.school = school;  // "Marshall High School" is assigned to school
	
//step3	and then it comes to HighSchoolStudent extends Student :
//	public String toString() {
//		return "High school " + super.toString();  //super.object
//	}
	
//step4	here "High school " is printed out and it calls super class(public class Student)'s String method:
//	public String toString() {
//	return "student at " + school;
//   }
//step5	buradan da "student at " + school("Marshall High School")'i alir.
//	"High school " + super.toString() = "High school student at Marshall High School" yazdirir
	
	System.out.println(student1);  //High school Student at Marshall High School
		
	
	ElementarySchoolStudent student2 = new ElementarySchoolStudent("Lemon Road ES");
	
	System.out.println(student2);  //elementary School Student at Lemon Road ES
	}
	
}
