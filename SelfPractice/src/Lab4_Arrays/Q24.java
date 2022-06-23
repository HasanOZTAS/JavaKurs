package Lab4_Arrays;

public class Q24 {

	public static void main(String[] args) {
		
		/*
		 A value is "everywhere" in an array if for every pair 
		 of adjacent elements in the array, at least one of the 
		 pair is that value. Write a method that accepts an array 
		 and a number, and prints true if the given number is 
		 everywhere in the array.

		 */
		int[] x = {1, 2, 1, 3};
		int a = 2;
		//Output: false
		int[] y = {1, 2, 1, 3};
		int b = 1;
		//Output: true
		
		System.out.println(nextNum(x,a));
		System.out.println(nextNum(y,b));

	}
	
	public static boolean nextNum (int[] arr, int k) {
				
		for (int i=0; i<arr.length-2; i++) {
			if (arr[i] == k && arr[i+1]==k || arr[i+2]==k) {				
				return true;				
			}			
		}
		return false;		
	}

}
