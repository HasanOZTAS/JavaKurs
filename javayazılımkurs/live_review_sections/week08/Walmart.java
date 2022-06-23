package week08;

public class Walmart {

	public static void main(String[] args) {
		
		Item[] items = { 
						new Item("Toilet Paper", 2, 100) ,
						new Item("cucumber", 1.59, 113) ,
						new Item("tomatoes", 1.99, 7) ,
						new Item("potatoes", 3.99, 5) ,
						new Item("shirt", 12.99, 3) ,
						new Item("tv", 200.99, 1) ,			
						};
		
		double totalPriceBeforeTax = 0;
		int largestQuantity = 1;
		String nameOfItem = "";
		
		for (Item each : items) {
			totalPriceBeforeTax += each.calCost();
			if (each.quantity > largestQuantity) {
				largestQuantity = each.quantity;
				nameOfItem = each.name;
			}
			
			
		} 
		System.out.println("Total: $" + totalPriceBeforeTax );
		System.out.println(nameOfItem + " has the largest quantity");
		
		
		
		
		

	}

}
