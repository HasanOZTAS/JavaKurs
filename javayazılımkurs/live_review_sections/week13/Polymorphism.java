package week13;

public class Polymorphism {

	public static void main(String[] args) {
		
		
		Animal animal1 = new Dog();
		animal1.eat();
		//animal1.bark();  //  Error
		((Dog)animal1).bark();  //  down-casting
		((Dog)animal1).swim();  //  down-casting
		//((Eagle)animal1).fly();  //  Error  --  IS A relationship is needed.
		
		
		
		Animal animal2 = new Lion();
		Animal animal3 = new Eagle();

	}

}
