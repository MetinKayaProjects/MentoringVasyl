package office_hour_maaruf_2;

public class CallPeopleFromHere {
	public static void main(String[] args) {
		//need to create object to access
		// nonstatic variable
		People mymanNursultan = new People();

		System.out.println(mymanNursultan.hardToGet);
		System.out.println(mymanNursultan.easyToGet);

		// System.out.println(People.hardToGet);// this doesn't work.
		// since we cannot call from static to nonstatic if you dont create an object
		//-----------------
		//no need to create object to access to static varibles
		System.out.println(People.easyToGet);
		
		
		//use object to access to non static method
		mymanNursultan.sayMyName();
		
		//use class name to access the static method
		People.whatMyName();
		
//		mymanNursultan.hardToGet;  //static cannot call nonstatic
		
		

	}

}
