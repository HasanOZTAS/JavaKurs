package Lab4_Arrays;

import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints an array with 
		 the elements "rotated left”
			int[] x = {1,2,3}; = > [2,3,1]
			int[] y = {17,12,10,8}; = > [12,10,8,17]
			int[] a = {7,0,0}; = > [0,0,7]
		 */		
		
		int[] x = {17,12,10,8};   //  change to this [12,10,8,17]
		
		System.out.println(Arrays.toString(changeArr(x)));
	
	}
	
	public static int[] changeArr(int[] arr) {
		
		int a = arr[0];
		for (int i=0; i<arr.length-1; i++) {
			
			arr[i] = arr[i+1];
		}
		//arr[arr.length-1] = a;
		return arr;
		
		
		
	}

}
