package day24_arrays_part1;

import java.util.Scanner;

public class Task86_MonthArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] month = new String[12];
		
		
		month[0] ="January";		
		month[1] ="February";
		month[2] ="March";
		month[3] ="April";
		month[4] ="May";
		month[5] ="June";
		month[6] ="July";
		month[7] ="August";
		month[8] ="September";
		month[9] ="October";
		month[10] ="November";
		month[11] ="December";
		
		System.out.println("Enter index number");
		int num = sc.nextInt();
		
		System.out.println("The month name is " + month[num-1]);
	
	}

}
