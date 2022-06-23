package Exercises2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int count=10;
		int pre1=0;
		int pre2=1;
		
		System.out.println("Fibonacci series of " + count + " numbers");
		
		System.out.print(0 + " ");
		
		for (int i=1; i<count; i++) {			
			
			System.out.print(pre2 + " ");
			int sumOfPrevTwo = pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrevTwo;
			
		}
		

	}

}
