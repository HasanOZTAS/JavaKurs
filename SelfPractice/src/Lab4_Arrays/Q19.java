package Lab4_Arrays;

public class Q19 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints the total 
		 of the numbers in the array, except ignore sections of numbers 
		 starting with a 6 and extending to the next 7 (every 6 will be 
		 followed by at least one 7).

		 */
		int[] x = {1,2,2}; 					// = > 5
		int[] y = {1, 2, 2, 6, 99, 99, 7}; 	// = > 5
		int[] a = {1,1,6,7,2}; 				// = > 4
		int[] b = {1,1,6,2}; 				// = > 2
		int[] c = {1,2,2,6,99,99,7,3,4};	//  = > 12
		
		System.out.println(ignore67(x));
		System.out.println(ignore67(y));
		System.out.println(ignore67(a));
		System.out.println(ignore67(b));
		System.out.println(ignore67(c));
		

	}
	
	public static int ignore67 (int arr[]) {
		
		int sum = 0;
		boolean CheckSix = false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(CheckSix) {
				
				if(arr[i] == 7 ) {					
					CheckSix = false;
				}				
				
			}else if(arr[i] == 6) {				
				CheckSix = true;
				
			}else {				
				sum = sum + arr[i];				
			}
		}
		return sum;				
	}

}
