package replit;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter cents:");
	    int cent = sc.nextInt();
									
		int quarters=cent/25;		
		int dimes=(cent%25)/10;
		int nickles=((cent%25)%10)/5;
		int pennies=(((cent%25)%10)%5)/1;
			
				
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + 
							nickles + " nickles, and " + pennies + " pennies");

	}

}
