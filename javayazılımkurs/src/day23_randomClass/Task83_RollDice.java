package day23_randomClass;

import java.util.Random;
import java.util.Scanner;

public class Task83_RollDice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int dice1;
		int dice2;
		String again = "y";
		
		
		while (again.equalsIgnoreCase("y")) {
			
			System.out.println("Rolling the dice...");
			dice1 = rn.nextInt(6)+1;
			dice2 = rn.nextInt(6)+1;
			
			System.out.println("Their values are " + dice1 + " " + dice2);
			
			System.out.println("Roll them again (y=yes)?");
			again = sc.nextLine();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
