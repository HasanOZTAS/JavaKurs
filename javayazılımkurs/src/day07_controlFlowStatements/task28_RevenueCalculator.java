package day07_controlFlowStatements;

public class task28_RevenueCalculator {

	public static void main(String[] args) {
		
		double price=100;
		int quantity=100;
		double revenue;
		double discount=0;
		
		revenue=price * quantity;
		
		if (revenue > 5000) {
			discount = revenue*0.1;
			revenue=revenue-discount;
			
			
		}	
			System.out.println("Discount is " + discount);
			System.out.println("Revenue is " + revenue );
		
		
		
		

	}

}
