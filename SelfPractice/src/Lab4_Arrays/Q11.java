package Lab4_Arrays;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts an array, and if there is a 2 in the array immediately
		followed by a 3, set the 3 element to 0. Print the changed Array
		*/
		
		int[] x = {1,2,3}; 	//  = > [1,2,0]
		int[] y = {2,3,5}; 	//  = > [2,0,5]
		int[] a = {1,2,1}; 	//  = > [1,2,1]
		int[] b = {11,2,13,3,2}; 	//  = > [11,2,13,3,2]	
		
		System.out.println(Arrays.toString(change3(x)));
		System.out.println(Arrays.toString(change3(y)));
		System.out.println(Arrays.toString(change3(a)));
		System.out.println(Arrays.toString(change3(b)));

	}
	
	public static int[] change3 (int[] arr) {
				
		for (int i=0; i<arr.length-1; i++) {			
			
			if (arr[i] == 2 && arr[i+1] == 3) {
				arr[i+1] = 0;
			}			
		}
		return arr;		
	}
	
	
}
