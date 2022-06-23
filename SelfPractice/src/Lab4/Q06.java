package Lab4;

import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and figure out which is 
		 greatest element in the array, a and set all the other elements 
		 to be that value. Print the changed array.
		 */
		
		
		int[] x = {1,2,3};    //   = > [3,3,3]
		
		int[] y = {11,5,9};   //   = > [11,11,11]
		
		int[] a = {110,5,98,0,1200,11,-4};    //   = > [1200,1200,1200,1200,1200,1200,1200]
		
		System.out.println(Arrays.toString(largeArray(x)));		
		System.out.println(Arrays.toString(largeArray(y)));
		System.out.println(Arrays.toString(largeArray(a)));
		

	}
	
	public static int[] largeArray(int[] arr) {
		
		int max = arr[0];
		
		for (int i=0; i<arr.length-1; i++) {
		
			if(arr[i+1] > max) {
				max = arr[i+1];
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = max;
		}
		
		return arr;
		
		
		
		
		
	}

}
