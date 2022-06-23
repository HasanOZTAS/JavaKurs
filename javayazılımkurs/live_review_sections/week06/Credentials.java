package week06;

import java.util.Scanner;

public class Credentials {

	public static void main(String[] args) {
		
		/*
		 
		 */
		
		String EU = "Cybertek";
		String EP = "Cybertek123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your username");
		String username = sc.next();
		
		System.out.println("Enter your password");
		String password = sc.next();
		
		if (username.equals(EU) && password.equals(EP)) {
			System.out.println("You logged in");			
		}else {			
			for (int i=1; i<=3; i++) {
				
				if (i == 3) {
				System.err.println("Your account locked, please contact with the customer service");
				System.exit(0);
			}
				
			System.out.println("Username or password is incorrect");
			System.out.println("Please re-enter your username");
			username = sc.next();
			
			System.out.println("Please re-enter your password");
			password = sc.next();
			
			if (username.equals(EU) && password.equals(EP)) {
				System.out.println("You logged in");
				break;
			}
			
			
			}
		}
		
		

	}

}
