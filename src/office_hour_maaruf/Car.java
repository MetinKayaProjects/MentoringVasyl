package office_hour_maaruf;

public class Car {

	private String make, model, price;

	//create constructor:
	public Car(String mmake, String model, String price) {
		make = mmake; // yukarida mmake yazarsan burada this.'e gerek yok
		this.model = model;
		this.price = price;

	}

	// getter setter yaptik. setterlari commanda aldik sadece bu setteri buraya
	// tasidik
	public void setPrice(String price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

//	public void setMake(String make) {
//		this.make = make;
//	}

	public String getModel() {
		return model;
	}

//	public void setModel(String model) {
//		this.model = model;
//	}

	public String getPrice() {
		return price;
	}

}
