package Lab4;

public class Q12 {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts two arrays and 
		 prints how many of the arrays have 1 as their first
		element
		*/
			int[] x = {1,2,3};
			int[] y = {1,3};
			//Output = 2
			int[] a = {7,2,3};
			int[] b = {1};
			//Output = 1
			int[] c = {3,2,4};
			int[] d = {0,3,4};
			//Output = 0
		 
		System.out.println(start1(x,y));
		System.out.println(start1(a,b));
		System.out.println(start1(c,d));	

	}
	
	public static int start1 (int[] arr1, int[] arr2) {
		
		int count1 = 0;		
		
			if (arr1[0] == 1) {
				count1++;
			}
		
			if (arr2[0] == 1) {
				count1++;
			}
		
		return count1;	
		
	}

}
