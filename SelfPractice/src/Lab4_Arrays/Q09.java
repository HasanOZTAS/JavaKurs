package Lab4_Arrays;

import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints 
		 a new array with double the length
		where its last element is the same as the original array,
		 */
		int[] x = {4,5,6}; 		// = > [0,0,0,0,0,6]
		
		int[] y = {2,5,4,6,8,7,9};
		
		System.out.println(Arrays.toString(newArr(x)));
		System.out.println(Arrays.toString(newArr(y)));
	}
	
	public static int[] newArr(int[] arr) {
		
		int newArray[] = new int[arr.length*2];
		
		newArray[newArray.length-1] = arr[arr.length-1];	
		
		return newArray;	
		
	}

}
