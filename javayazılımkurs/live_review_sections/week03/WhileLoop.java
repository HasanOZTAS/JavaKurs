package week03;

public class WhileLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("*******");
		
		int j=1;
		while(j++<=5) {
			// j++;
			System.out.println("Hello");
			// j++;
		}
		
		System.out.println("*******");
		
		
		int k=1;
		int l=100;
		
		while(k<=l) {
			System.out.println(k++ + " ");
			// k++;
		}
		
		System.out.println("******");
		
		int a=1;
		do {
			System.out.println("Hello");
		}while (a++<=5);
		
		
		
		
		

	}

}
