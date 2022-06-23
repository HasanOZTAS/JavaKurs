package week14;

import week13.Animal;
import week13.Dog;
import week13.Lion;

public class Polymorphism {

	public static void main(String[] args) {
		
		
		int b = 10;
		double a = b; // implicit casting-- smaller inside to larger
		
		
		//short s = a;			// needs casting
		short s = (short) a;	// explicit casting-- larger inside to smaller
		
		
		Animal animal1 = new Dog();	// upcasting-- implicit
		//Animal animal1 = (Animal) (new Dog());	// same with above one
		
		//animal1.bark();	 // no bark method
		
		//Dog dog = animal1;	// needs casting
		Dog dog = (Dog) animal1;	// down casting
		
		dog.bark();		// now has bark method
		
		//Lion catLion = animal1;	// error-- needs casting
		Lion lion = (Lion) animal1;	// down casting
		lion.hunting();
		
		
		

	}

}
