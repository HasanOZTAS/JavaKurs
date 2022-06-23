package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		/*
		 Enter a whole number from 1-99, and I will
		find a combination of coins that equals 
		that amount of change		
		 
		 quarter : 25 cents
		 dimes   : 10 cents
		 nickles : 5 cents
		 pennies : 1 cent		 
		*/
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("Enter a number from 1-99: ");
		
		int attempt=0;
		
		
		do {
			
			int coinTotal    = keyboard.nextInt();
			if (coinTotal>0 && coinTotal<=100) {
			changeMaker(coinTotal);
			break;
			}else {				
				attempt++;
				if(attempt==3) {
					System.out.println("Sorry, no more attempt");
				}else {
					System.out.println("Try again");
				}
			}			
		 }while (true);		
	
	}
	

	public static void changeMaker(int coin) {
		
				
		int quarter= coin/25;
		int dimes  = (coin%25)/10;
		int nickles= ((coin%25)%10)/5;
		int pennies= (((coin%25)%10)%5)/1;
		 
		 System.out.println(coin + " cents is " + quarter+ " quarter " + dimes+ " dimes " +
				nickles + " nickles " + pennies + " pennies");
		
		
		
	}
	
	
	

}
