package Lab4_Arrays;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts 2 arrays and checks the lengths 
		 of the arrays first. If lengths are more than 1, it prints 
		 true if the arrays have the same first element or they have the 
		 same last element. If the length of the array is not more than 1, 
		 it prints the "array1 is not a valid array " or "array2 is not a valid array"
		 */
		
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(firstLastEqual(a,b));	
		
		
	}

	public static String firstLastEqual(int[] arr1, int[] arr2) {
		
		if(!(arr1.length >1)) {
			return "Array 1 is not valid";
		}
		
		if(!(arr2.length >1)) {
			return "Array 2 is not valid";
		}
		
		if (arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]) {
			return "true";			
		}else {
			return "false";
		}
		
		
	}

}
