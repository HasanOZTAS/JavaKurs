package week04;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter employee ID");
		int id = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter your full name");
		//String name = scan.next();  // Only takes one word
		String name = scan.next();
		
		scan.close();
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		
		
		

	}

}
