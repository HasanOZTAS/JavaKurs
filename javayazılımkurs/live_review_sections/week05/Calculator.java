package week05;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in); //  \n\n

		
		while(true) {
			System.out.println("Enter your first number");
			int f = scan.nextInt();  

			System.out.println("Enter your second number");
			int s = scan.nextInt();  
			

			System.out.println("Enter a math operator");
			char operator = scan.next().charAt(0);
			
			switch (operator) {
			case '-' : 
				System.out.println("Subtraction " + (f-s));
				break;
			case '+':
				System.out.println("Addition " + (f+s));
				break;
			case '*':
				System.out.println("Multiplication " + (f*s));
				break;
			case '/':
				System.out.println("Division " + (f/s));
				break;
			default:
				System.out.println("Invalid Operator");	
			
			}
			

			scan.nextLine(); // \n\n , TAKES EVERYTHING, INCLUDING ENTER 
			
			System.out.println("Do you want to continue?");
			String a = scan.nextLine().toLowerCase();
			
			while( ! (a.equals("yes") || a.equals("no")) ) { // if the answer is invalid
				System.out.println("Invalid Entry, pelase re-enter");
				 a = scan.nextLine().toLowerCase();
			}
			
			
			if(a.equals("no")) {
				System.out.println("Test Completed");
				break;
			}
			
		}	
		scan.close();
		

	}		

	}


