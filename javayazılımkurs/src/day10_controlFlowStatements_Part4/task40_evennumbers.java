package day10_controlFlowStatements_Part4;

public class task40_evennumbers {

	public static void main(String[] args) {
		
		
		// Write a program that displays all even numbers between 1-100
		// in same line
		
		
		for (int x=2 ; x<=100; x+=2) {
			System.out.print(x + " ");
		}
		
		
		System.out.println("*******");
		
		for (int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
