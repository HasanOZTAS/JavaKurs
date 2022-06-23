package week04;

public class Circle {
	
	public double radius;	// attribute radius
		
	
	public double calculateArea() {	// action to calculate area
		
		return radius * radius * Math.PI;	
		
	}
	
	public double calculatePerimeter() {	// action to calculate perimeter
		
		return 2 * radius * 3.14;
		
	}
	
	public String toString() {
		
		return "Radius: " + radius + ", Area: " +
				calculateArea() + ", Perimeter: " + 
				calculatePerimeter();
	}
	
	
	
	

}
