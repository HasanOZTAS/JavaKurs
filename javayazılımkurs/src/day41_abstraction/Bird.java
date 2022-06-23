package day41_abstraction;

public abstract class Bird extends Animal{	//  If abstract not first concrete class

	/*
	@Override
	public void eat() {			//  Override of abstract method of Parent(Animal) class  --  mandatory if Bird is not abstract
		
		System.out.println("Bird is eating");
	}
	*/

	@Override
	public void breathe() {		//  Override of abstract method of Parent(Animal) class  --  mandatory if Bird is not abstract
		
		System.out.println("Bird is breathing");
	}
	
	public abstract void fly();	// Abstract classses can have abstract methods even they extends.
	
	
	
	

}
