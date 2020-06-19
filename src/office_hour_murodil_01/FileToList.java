package office_hour_murodil_01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileToList {
public static void main(String[] args) throws FileNotFoundException {
	
	File file =new File("products.txt");
	Scanner scan = new Scanner(file);
	//System.out.println(scan.nextLine());
	//hasNextLine will be true if there is line of data
	
//	System.out.println(scan.hasNextLine()); //is there a nextLine? if there is go on 
//	System.out.println(scan.nextLine());
	
	ArrayList<String> data = new ArrayList<String>();
	
	System.out.println();
	while(scan.hasNextLine()) {
		String line = scan.nextLine();
//		data.add(scan.nextLine());
		data.add(line);
		System.out.println(line);
	}
	System.out.println();
	System.out.println("Data List: "+ data.toString());
	System.out.println("Number of data: " + data.size());
	 

}
}
