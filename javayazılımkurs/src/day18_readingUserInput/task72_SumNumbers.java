package day18_readingUserInput;

import java.util.Scanner;

public class task72_SumNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");		
		int num1 = sc.nextInt();
		System.out.println("Enter another");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3 = sc.nextInt();
		
		System.out.println("The sum of the numbers are: " + (num1+num2+num3));

	}

}
