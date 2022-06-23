package Lab4_Arrays;

public class Q08 {

	public static void main(String[] args) {
		
		// Write a method that accepts an array and 
		// prints true if it contains a 2 or a 3
		
		int[] x = {2,5}; 	// = > true
		int[] y = {4,3}; 	// = > true
		int[] z = {4,5}; 	// = > false
		
		System.out.println(contains23(x));
		System.out.println(contains23(y));
		System.out.println(contains23(z));

	}
	
	public static boolean contains23 (int[] arr) {
		
		for (int value:  arr) {
			if (value == 2 || value == 3) {
				return true;				
			}
				
		}return false;

}
}
