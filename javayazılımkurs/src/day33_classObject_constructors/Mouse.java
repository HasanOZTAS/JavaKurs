package day33_classObject_constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;	
	
	
	public Mouse(int weight) {
		this(30, weight);
		this.weight = weight;
		System.out.println("JAVA");
	}

	public Mouse(int numTeeth, int weight) {
		this (numTeeth, 20, weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}

	public Mouse(int numTeeth, int numWhiskers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print () {
		
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	
	
	
	
	
	
	
	
	
	
	

}
