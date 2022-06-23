package week05;

public class PizzaObjects {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		
		pizza1.customizeOrder("Large", 2, 3);
		System.out.println(pizza1);
		
		
		
		Pizza pizza2 = new Pizza();
		pizza2.customizeOrder("Small", 2, 1);
		System.out.println(pizza2);
		
		
		Pizza pizza3 = new Pizza();
		pizza3.customizeOrder("Medium", 3, 2);
		System.out.println(pizza3);
		
		System.out.println("*******");		
		
		//	159 pizza  
		double totalPrice = 0;
		
		for (int i=1; i<=159; i++) {
			Pizza pizza4 = new Pizza();
			pizza4.customizeOrder("Medium", 2, 3);
			totalPrice+= pizza4.calculatePrice();
		}
		
		System.out.println("159 Pizza is " + totalPrice);
		
		
		
	}

}
