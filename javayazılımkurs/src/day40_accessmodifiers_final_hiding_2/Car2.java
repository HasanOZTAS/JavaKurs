package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car{  // in different package but inherited class ( and imported )
	
	public Car2() {
		
		//model = "M";	// model is default		cannot be accessed from different package even if inherited
		year = 2017;	// year is  public		can be accessed everywhere
		//door = 4;  	// door is  private		can be accessed just in the class that created even if inherited
		engine = 5.2;	// engine is protected	can be accessed if inherited
		
	}
	
	

}
