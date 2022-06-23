package day16_classObjects;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	
	public void call() {
		System.out.println(brand + " Calling....");
	}
	
	public void message() {
		System.out.println(brand + " Sending text message....");
	}
	
	public void takeAphoto() {
		System.out.println(brand + " Taking a photo");
	}

}
