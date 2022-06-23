package day25_arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
		double[] prices = {120.0, 12.99, 300, 25, 67.89};
		
		
		for (int i=0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println();
		
		for(String prod : products) {
			System.out.println(prod);
		}
		System.out.println("*******");
		
		for (int j=0; j<prices.length; j++) {
			System.out.print(prices[j]);
		}
		System.out.println();
		
		for (double prc : prices) {
			System.out.print(prc);
		}
		
		System.out.println();
		System.out.println("*******");
		
		// print products in reverse order
		for (int a=products.length-1; a>=0; a--) {
			System.out.println(products[a]);
		}
		
		

	}

}
