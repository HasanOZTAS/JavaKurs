package Lab4_Arrays;

public class Q18 {

	public static void main(String[] args) {
		
		/*
		 Write a function that accepts an array and prints the sum of 
		 the numbers in the array. Except the number 13 is very unlucky, 
		 so it does not count and numbers that come immediately after 
		 a 13 also do not count
		 */
		
		int[] x = {1,2,2,1}; 		// = > 6
		int[] y = {1,1}; 			// = > 2
		int[] a = {1,2,2,1,13}; 	// = > 6
		int[] b = {1,2,2,1,13,3}; 	// = > 6 
		
		
		System.out.println(except13(x));
		System.out.println(except13(y));
		System.out.println(except13(a));
		System.out.println(except13(b));
		

	}
	
	public static int except13 (int arr[]) {
		
		int sum=0;
		int a=1;
		
		for (int i=0; i<arr.length; i++) {
			if ( arr[i] != 13) {
				sum += arr[i];
			}else {
				break;
			}
		}		
		return sum;		
	}

}
