package week12;

public final class Tesla extends Car {

	public Tesla(String model, String color, int year) {
		super("Tesla", model, color, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		
		System.out.println("Say start");
	}
	
	public void autoPilot() {
		
		System.out.println("Tesla is self driving");
	}
	
	

}
