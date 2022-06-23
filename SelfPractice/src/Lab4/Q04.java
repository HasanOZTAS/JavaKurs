package Lab4;

public class Q04 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts an array and prints the sum of all elements in the array
			int[] x = {1,2,3}; = > 6
			int[] y = {5,11,2}; = > 18
			int[] z = {7,0,0}; = > 7
			int[] a = {3,-2,10,4}; = > 15
		 */
		
		
		int[] x = {1,2,3};
		
		int[] y = {-4,2,0};
		
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));

	}
	
	public static int sumArray(int[] arr) {
		
		int sum=0;
		
		for (int each : arr) {
			sum += each;
		}
		return sum;
		
		/*
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
		*/
		
	}

}
