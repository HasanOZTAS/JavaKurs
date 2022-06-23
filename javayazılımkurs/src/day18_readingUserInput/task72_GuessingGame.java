package day18_readingUserInput;

import java.util.Scanner;

public class task72_GuessingGame {

	public static void main(String[] args) {
		
		int userInput;
		int secretNumber=8;
		
		Scanner abc = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 20..");
		
		do {			
			userInput=abc.nextInt();
			
			if(userInput<secretNumber) {
				System.out.println("Enter a bigger number");
			}else if (userInput>secretNumber) {
				System.out.println("Enter a smaller number");
			}else {
				System.out.println("Congrat you got it");
			}				
		}while(userInput != secretNumber);
	}

}
