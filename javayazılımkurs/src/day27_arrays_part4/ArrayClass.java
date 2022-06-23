package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		// toString()
		int[] nums = {43,12,4,1,2,5};
		System.out.println(Arrays.toString(nums));
		
		// equals()
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		
		
		//sort() : sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu","Spanish","Italian","english","1Polish","arabic","@abc"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		System.out.println();
		
		// binary Search() 
		int[] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7));
		System.out.println(Arrays.binarySearch(numX, 55));
		
		System.out.println(Arrays.binarySearch(numX, 5));  // -2
		System.out.println(Arrays.binarySearch(numX, 2));
		
		int[] numX1 = {40,6,101,101,72};
		System.out.println(Arrays.binarySearch(numX1, 8));
		
		System.out.println();
		
		// copyOf()
		double[] d1 = {2.3,4.5,12.4};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 100.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3 =Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		double[] d4 =Arrays.copyOf(d2, 5);
		System.out.println(Arrays.toString(d4));
		
		System.out.println("*******");
		
		
		int numbers[]= {1,2,3,66,7,8,9,4,5};
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 66));
        System.out.println(Arrays.binarySearch(numbers, 50));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 8));
        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println("*******************************************");
        
        char alphabet[]= {'a','b','c','z','m','g','h','i','d','e'};
        System.out.println(Arrays.binarySearch(alphabet, 'c'));
        System.out.println(Arrays.binarySearch(alphabet, 'd'));
        System.out.println(Arrays.binarySearch(alphabet, 'e'));
        System.out.println(Arrays.binarySearch(alphabet, 'z'));
        System.out.println(Arrays.binarySearch(alphabet, 'h'));
        System.out.println(Arrays.binarySearch(alphabet, 'i'));
        System.out.println(Arrays.binarySearch(alphabet, 'l'));
        System.out.println(Arrays.binarySearch(alphabet, 'b'));
        System.out.println(Arrays.binarySearch(alphabet, 'a'));

	}

}
