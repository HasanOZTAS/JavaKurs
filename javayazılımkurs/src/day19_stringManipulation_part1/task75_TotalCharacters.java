package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = name.next();
		
		System.out.println("Enter your last name:");
		String lastName = name.next();
		
		System.out.println("Total characters in your first and last name is: " + 
		((firstName.length()) + lastName.length()));
		
		

	}

}
