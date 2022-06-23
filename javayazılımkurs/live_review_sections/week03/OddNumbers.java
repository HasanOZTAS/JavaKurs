package week03;

public class OddNumbers {

	public static void main(String[] args) {
		
		
		for(int i=1; i<1000; i+=2) {
			System.out.print(i + " ");					
		}
		
		System.out.println("*******");   // Both same
		
		for(int i=0; i<=1000; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}

	}

}
