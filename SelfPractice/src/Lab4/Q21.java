package Lab4;

public class Q21 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints true 
		 if the sum of all 2's in the array is exactly 8

		 */
		int[] x = {2, 3, 2, 2, 4, 2}; 		// = > true
		int[] y = {2, 3, 2, 2, 4, 2, 2}; 	// = > false
		int[] z = {1, 2, 3, 4}; 			//= > false
		
		System.out.println(sum2(x));
		System.out.println(sum2(y));
		System.out.println(sum2(z));

	}
	
	public static boolean sum2 (int[] arr) {
		
		int sum=0;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] == 2) {
				sum= sum+arr[i];
			}			
		}
		if (sum==8) {
			return true;
		}else {
			return false;
		}		
	}
}
