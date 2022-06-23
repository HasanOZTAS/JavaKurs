package day18_readingUserInput;

import java.util.Scanner;

public class task74_positivesTotal {

	public static void main(String[] args) {
		
		int sum=0;
		int x=0;
		
		Scanner has = new Scanner(System.in);
					
		do {
			System.out.println("Enter a positive number");
			x=has.nextInt();
			if (x<0) {
				break;
			}else {
				sum=sum+x;
			}		
		}while (true);
		System.out.println("Total is: " + sum);

	}

}
