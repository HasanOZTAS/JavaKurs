package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {  //  in different package
		
		Car c = new Car();
		
		//c.model = "M3";	//  model is default		cannot be accessed from another packages
		c.year = 2017;		// year is public			can be accessed from everywhere
		//c.door = 4;		// door is private			can be accessed just in the class that created
		//c.engine = 5.2;	// engine is protected		cannot be accessed from different packages if no inheritance
		
		

	}

}
