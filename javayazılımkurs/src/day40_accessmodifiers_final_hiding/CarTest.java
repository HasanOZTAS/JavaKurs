package day40_accessmodifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {  //  in the same package
		
		Car c = new Car();
		
		c.model = "M";	// model is default		can be accessed in the same package
		c.year = 2017;	// year is  public		can be accessed everywhere
		// c.door = 4;  // door is  private		can be accessed just in the class that created
		c.engine = 5.2; // engine is protected	can be accessed in the same package or inherited classes
		
		
		
		
		

	}

}
