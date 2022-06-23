package day40_accessmodifiers_final_hiding;

import java.util.Arrays;

public class FinalArray {

	public static void main(String[] args) {
		
		final int[] TEAMS = {11,11};
		System.out.println(TEAMS[0]);
		
		TEAMS[0] = 15;
		System.out.println(TEAMS[0]);
		
		int[] nums = new int[] {20, 20, 40};
		nums = new int[] {10, 15, 100};
		
		final int[] finalNums = {23, 66 ,44};
		finalNums[0] = 120;
		System.out.println(finalNums[0]);
		finalNums[1] = 105;
		finalNums[2] = 112;
		System.out.println(Arrays.toString(finalNums));  //  Array elements can be changed one by one 
														 //  without any problem even if the array is final
		
		
		//finalNums = new int[] {1, 2, 3, 4};  //  error -- reference(finalNums) cannot be changed if final
		
		
		final int A = 5;
		final int B = 7;
		final int[] abc = {A, B};
		System.out.println(Arrays.toString(abc));
		abc[0] = 3;
		System.out.println(abc[0]);
		

	}

}
