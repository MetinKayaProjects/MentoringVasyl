package office_hour_vasyl_0606_OOP_2;
/*Write a class Director that contains:
	- private instance name type of String.
	- a constructor that accepts a String corresponding to the directors name.
	- a toString method that returns 'Name: name'.*/
public class Director {
	
	private String name;
	
	public Director(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name: " + name;
	}
	public String getName() {
		return name;
	}
	
	

}
