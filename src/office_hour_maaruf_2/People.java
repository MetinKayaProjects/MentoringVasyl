package office_hour_maaruf_2;

public class People {
	
	String hardToGet = "Nursultan";
	
	static String easyToGet = "Muhtar";
	
	public void sayMyName() {   //non=static method
		System.out.println(hardToGet);//nonstatic calls non-static
		System.out.println(easyToGet);//nonstatic calls static
	}
	public static void whatMyName() {  //static method
		System.out.println(easyToGet);
//		System.out.println(hardToGet); // static cannot call nonstatic
	}
	
}
