package officehour_marufjan_0529;

public class PetSmart {
	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed = "persian cat";
		murodilsCat.name = "Bars";

		sellCat(murodilsCat);
		
		OnlineCat marufsImaginaryCat = new OnlineCat();
		marufsImaginaryCat.breed = "labenese";
		marufsImaginaryCat.name = "Tars";
		marufsImaginaryCat.location = "Arlington, TX";
		
		sellCatOnline(marufsImaginaryCat);
		murodilsCat.makeSomeNoise();
		marufsImaginaryCat.makeSomeNoise();
	}

	public static void sellCat(Cat cat) {
		System.out.println("Selling " + cat.breed);
		System.out.println("Its name is " + cat.name);
	}

	public static void sellCatOnline(OnlineCat cat) {
		System.out.println("Selling " + cat.breed);
		System.out.println("Its name is " + cat.name);
		System.out.println("Its location is "+ cat.location);
	}
}





