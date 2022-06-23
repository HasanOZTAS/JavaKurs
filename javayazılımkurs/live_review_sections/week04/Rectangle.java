package week04;

public class Rectangle {
	
	public double width, length;
	
	public double area() {
		return width * length;
	}
	
	public double perimeter () {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area= " +area()
		+", perimeter= "+perimeter()+"]";
	}

	
	
	
	
	
	

}
