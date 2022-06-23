package week07;

import java.util.Arrays;

import utility.ArraysUtility;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
		
		int[] arr3 = new int[arr1.length+arr2.length];
		int i = 0;
		
		for (int each : arr1) {
			arr3[i++] = each;			
		}
		
		for (int each : arr2) {
			arr3[i++] = each;
		}
		
		System.out.println(Arrays.toString(arr3));	
		
		System.out.println("*******");
		
		String[] group1 = {"Hasan","Bilal", "Kunduz", "Berk"};
		String[] group2 = {"Azat", "Serap", "Akhtam"};
		String[] group3 = {"Ümit", "Nur", "Sema"};
		
		String[] names = ArraysUtility.merge(group1,group2);
		System.out.println(Arrays.toString(names));
		
		String[] allNames = merge(group1,group2,group3);
		System.out.println(Arrays.toString(allNames));

	}
	
	public static int[] merge(int[] arr1, int arr2[]) {
		
		int[] arr3 = new int[arr1.length+arr2.length];
		int i = 0;
		
		for (int each : arr1) {
			arr3[i++] = each;			
		}
		
		for (int each : arr2) {
			arr3[i++] = each;
		}
		return arr3;
	}
	
	public static String[] merge (String[] arr1, String[] arr2, String[] arr3) {
		
		return ArraysUtility.merge(ArraysUtility.merge(arr1, arr2), arr3);
		
	}
	
	
	public static int max(int a, int b) {
		return a>=b ? a : b;
		
	}
	
	
	
	
	

}
