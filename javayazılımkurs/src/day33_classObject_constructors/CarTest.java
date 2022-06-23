package day33_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		Car c2 = new Car("Valkwagen", "Jetta", 2009, 55000, "Grey");
		
		Car c3 = new Car("BMW", "3.20", 2017, 30000, "Red");
		
		System.out.println(c1.make);
		System.out.println(c2.make);
		
		
		
		
		

	}

}
