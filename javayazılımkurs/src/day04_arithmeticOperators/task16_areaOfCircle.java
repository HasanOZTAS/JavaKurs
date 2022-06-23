package day04_arithmeticOperators;

public class task16_areaOfCircle {

	public static void main(String[] args) {
		
		// perimeter = 2* radius * PI
		// area = radius * radius *PI
		
		double radius, perimeter, area;
		final double PI=3.14;
		radius=5.5;
		perimeter = 2 * radius * PI;
		area= radius * radius * PI;
		
		System.out.println("Perimeter of the circle is " + perimeter);
		System.out.println("Area of the circle is " + area);
		
		
		
		

	}

}
