package day44_oopReview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		
		// create 3 shapes using polymorphism
		
		Shape square = new Square();
		Shape diamond = new Diamond();
		Object shapeObject = new Shape();
		
		square.draw();
		
		diamond.draw();
		
		((Square)square).squareMethod();
		
		
		
		

	}

}
