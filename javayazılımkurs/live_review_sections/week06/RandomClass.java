package week06;

import java.util.Arrays;
import java.util.Random;

import utility.ArraysUtility;

public class RandomClass {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int[] array = new int[5];
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = rn.nextInt(10);			
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("*******");
		
		int[] numbers = {10,5,6,7,20};
		int max = numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);
		
		System.out.println();
		
		int[] a1 = {100,200,30,40};
		int max1 = ArraysUtility.max(a1);
		int min1 = ArraysUtility.min(a1);
		
		System.out.println(max1);
		System.out.println(min1);
		
		double[] a2 = {2.5, 3.4, 5.4,3.4,};
		double max2 = ArraysUtility.max(a2);
		double min2 = ArraysUtility.min(a2);
		
		System.out.println(max2);
		System.out.println(min2);
		
		
		
		
		
		

	}

}
