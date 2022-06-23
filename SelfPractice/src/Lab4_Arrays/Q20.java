package Lab4_Arrays;

public class Q20 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and 
		 prints true if the array contains a 2 next 
		 to a 2 somewhere.

		 */
		int[] x = {1,2,2}; 		// = > true
		int[] y = {1, 2, 1,2}; 	// = > false
		int[] a = {2,1,2}; 		// = > false
		int[] b = {2,2,1,2}; 	// = > true
		
		System.out.println(check2(x));
		System.out.println(check2(y));
		System.out.println(check2(a));
		System.out.println(check2(b));
				

	}
	
	public static boolean check2 (int arr[]) {
		
		boolean flag=false;
		
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i] == 2 && arr[i+1] == 2) {
				flag = true;
				break;
			}else {
				flag = false;
			}
		}
		return flag;
		
		
		
		
	}

}
