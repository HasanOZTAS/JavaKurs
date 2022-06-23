package day27_arrays_part4;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {
		
		int [][] numbers = {
						{1,2,3,4},
						{5,6},
						{9,10,11,23,30,50,60}
					};
		
		// display the number of rows
		
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		System.out.print(Arrays.toString(numbers[0]));
		System.out.print(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));
		
		System.out.println();
		
		// display the number of columns in each row
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println("The number of columns in row " + i+ " is " + numbers[i].length);
		}
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
		}
		
		

	}

}
