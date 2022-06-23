package day44_oopReview.shapes;

import static day44_oopReview.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeActions {

	public static void main(String[] args) {
		
		
		// run the drawSquare method
		drawSquare((Square)buildShape("square"));
		//ShapeManager.drawSquare(new Square());
		
		drawShape(buildShape("shape"));
		
		System.out.println();
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);

	}

}
