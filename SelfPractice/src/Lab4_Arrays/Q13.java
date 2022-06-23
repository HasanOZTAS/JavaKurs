package Lab4_Arrays;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts 2 arrays and consider the sum of 
		the values in each array. Print the array which has the largest 
		sum. In event of a tie, print "equal"
		*/
		
		int[] x = {1,2}; int[] y = {3,4}; 	// = > [3,4]
		int[] a = {5,6}; int[] b = {3,8}; 	// = > equal
		int[] c = {1,1}; int[] d = {1,0}; 	// = > [1,1]
		
		largerSum(x,y);
		largerSum(a,b);
		largerSum(c,d);
	}
	
	public static void largerSum (int arr1[], int[] arr2) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int value : arr1) {
			sum1 += value;
		}
		
		for (int i=0; i<arr2.length; i++) {
			sum2 += arr2[i];
		}
		
		if (sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if (sum1<sum2) {
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("Equal");
		}		
	}

}
