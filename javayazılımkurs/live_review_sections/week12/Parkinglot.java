package week12;

public class Parkinglot {	// Parkinglot HAS A toyota
	
	public static void main(String[] args) {
		
		Toyota toyota = new Toyota("Camry", "White", 2021);
		
		BMW bmw = new BMW("X5", "Blue", 2021);
		
		Tesla tesla = new Tesla("Model 3", "Red", 2019);
		
		toyota.start();
		bmw.start();
		tesla.start();
		
		System.out.println();
		
		System.out.println(toyota);
		System.out.println(bmw);
		System.out.println(tesla);
		
		
		
	}

}
