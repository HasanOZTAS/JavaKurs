package Lab4_Arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts 2 arrays and prints 
		 a new array containing all their elements			
		 */
		
		int[] x = {1,2}; int[] y = {3,4}; 	// = > [1,2,3,4]
		int[] a = {4,4}; int[] b = {2,2}; 	// = > [4,4,2,2]
		int[] c = {9,2}; int[] d = {3,4}; 	// = > [9,2,3,4]
		
		newArr(x,y);
		newArr(a,b);
		newArr(c,d);
	}
	
	public static void newArr (int arr1[], int[] arr2) {
		
		int[] arr3 = new int[arr1.length + arr2.length];
		int a=0;
		
		for (int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int j=arr1.length; j<arr3.length; j++) {
			arr3[j] = arr2[a];
			a++;
		}
		System.out.println(Arrays.toString(arr3));
	}

}
