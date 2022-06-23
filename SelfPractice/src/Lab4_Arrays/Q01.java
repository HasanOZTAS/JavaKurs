package Lab4_Arrays;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and return true 
		 if 6 appears as either the first or last element in 
		 the array. The array will be length 1 or more.
		int[] x = {1,2,6}; = > true
		int[] y = {6,1,2,3}; = > true
		int[] z = {13,6,1,2,3}; = > false
		 */
		
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		int[] k = {1};
		
		//calling the method
		System.out.println(appear6(x));
		System.out.println(appear6(y));
		System.out.println(appear6(z));
		System.out.println(appear6(k));
		
		
	}

	
	public static boolean appear6(int arr[]) {  // int[] arr
		
			if(arr.length<1) {
			return false;
			}
		
			if (arr[0] == 6 || arr[arr.length-1] == 6) {
				return true;
			}else {
				return false;
			}
				
		
	}

}
