package Lab4_Arrays;

public class Q16 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints 
		 the number of even numbers in the array.			
		 */
		
		int[] x = {2,1,2,3,4}; 	// = > 3
		int[] y = {2,2,0}; 		// = > 3
		int[] z = {1,3,5}; 		// = > 0
		
		System.out.println(evenNums(x));
		System.out.println(evenNums(y));
		System.out.println(evenNums(z));
	}
	
	public static int evenNums (int[] arr) {
		
		int count=0;
		
		for (int nums : arr) {
			if(nums%2==0) {
				count++;
			}
		}
		return count;		
	}

}
