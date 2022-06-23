package week04;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner abcd = new Scanner(System.in);
		
		int max=-2147483648;	//  smallest integer in java1
		
		int min = 2147483647;
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Enter a number: ");
			int number = abcd.nextInt();
			if (number > max) {
				max = number;				
			}
			
			if (number < min) {
				min = number;
			}		
		
		}
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);
		
		
		

	}

}
