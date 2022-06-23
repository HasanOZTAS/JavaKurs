package week06;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40};
		
		int[] result = new int[array.length];
		
		for (int i=0, j=array.length-1; i<result.length; i++, j--) {
			result[i] = array[j];
			
		}
		System.out.println(Arrays.toString(result));
		
		

	}

}
