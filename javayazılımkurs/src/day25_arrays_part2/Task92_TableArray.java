package day25_arrays_part2;

import java.util.Arrays;

public class Task92_TableArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}	
		System.out.println();		
		
		for (int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i] * 19 + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numbers));
		
		

	}

}
