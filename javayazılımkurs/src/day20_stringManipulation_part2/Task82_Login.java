package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task82_Login {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter you username");
		String userName = abc.nextLine();
		System.out.println("Enter your password");
		String password = abc.nextLine();
		
		String userNameInSystem = "abcd";
		String passwordInSystem = "1234";
		
		if (userName.equals("") && password.equals("")) {
			System.out.println("User Name and Password fields cannot be empty");
		}else if (userName.equals("") && !password.equals("")) {
			System.out.println("User Name cannot be empty");			
		}else if (!userName.equals("") && password.equals("")) {
			System.out.println("Password cannot be empty");
		}else if (!userName.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
			System.out.println("User Name or Password not valid, please verify");
		}else if (userName.equals(userNameInSystem) || password.equals(passwordInSystem)) {
			System.out.println("User logged in successfully");
		}
		

	}

}
