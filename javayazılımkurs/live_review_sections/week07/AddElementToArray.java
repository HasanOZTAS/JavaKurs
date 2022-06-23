package week07;

import java.util.Arrays;

public class AddElementToArray {

	public static void main(String[] args) {
		/*
		create a return method called addElements that can add an 
		Integer  after the  last index of an integer array
		*/
		
		int[] arr = {1,2,3};
		int element = 4;
		
		int[] newArray = new int[arr.length+1];
		
		int i=0;
		for (int each : arr) {
			newArray[i++] = each;
		}
		newArray[newArray.length-1] = element;   //  or newArray[i]
		System.out.println(Arrays.toString(newArray));
		
		System.out.println("*******");
		
		
		int[] nums = {10, 20, 30, 40};
		   nums = addElement(nums, 50);
		   
		   System.out.println(Arrays.toString(nums));
		   
		   System.out.println("----------------------------");
		 
		 int[] n = {100, 200, 300, 400}; 
		 
		 System.out.println(Arrays.toString(n));
		 
		 n =  addElement(  addElement( addElement(n, 500), 600 ) , 700);
		 
		 System.out.println(Arrays.toString(n));		
		

	}
	
	public static  int[] addElement(int[] arr, int element) {
		int[] newArray = new int[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (int each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}

}
