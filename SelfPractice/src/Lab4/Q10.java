package Lab4;

public class Q10 {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts an array and prints true 
		if the array contains 2 twice or 3 twice.
		*/
		
		int[] x = {2,2}; 		// = > true
		int[] y = {3,3}; 		// = > true
		int[] a = {2,3}; 		// = > false
		int[] b = {12,20,42}; 	// = > false
		int[] c = {2,2,2};		// = > false
		
		System.out.println(search23(x));
		System.out.println(search23(y));
		System.out.println(search23(a));
		System.out.println(search23(b));
		System.out.println(search23(c));	
	}
	
	public static boolean search23 (int[] arr) {
		
		int count2=0;
		int count3=0;
		
		for (int value : arr) {
			if (value ==2) {
				count2++;
			}else if (value == 3) {
				count3++;
			}
		}
		if (count2==2 || count3==2) {
			return true;
		}else {
			return false;
		}		
	}
}
