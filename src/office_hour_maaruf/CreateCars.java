package office_hour_maaruf;

public class CreateCars {
	public static void main(String[] args) {
		
		Car delorean = new Car("GM", "DeLorean", "20000");
		
		System.out.println(delorean.getMake());  //GM
		System.out.println(delorean.getModel());  //DeLorean
		System.out.println("Price: " + delorean.getPrice());  //20000
		
		delorean.setPrice("19000");
		System.out.println("New Price: " + delorean.getPrice()); //19000
		
		System.out.println();
		
		Car corolla = new Car("Toyota", "Corolla", "15000");
		System.out.println(corolla.getMake());
		System.out.println(corolla.getModel());
		System.out.println("Price: " + corolla.getPrice());
		
		
		corolla.setPrice("10000");;
		System.out.println("New Price: " + corolla.getPrice());
	}

}
