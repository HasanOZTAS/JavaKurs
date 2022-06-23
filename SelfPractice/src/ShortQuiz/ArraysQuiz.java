package ShortQuiz;

import java.util.Arrays;

public class ArraysQuiz {

	public static void main(String[] args) {
		
		/*
		char[] array = {'d', 'c', 'a' ,'b'};
		Arrays.sort(array);
		
		for (char each: array) {
			System.out.print(each + " ");
			if (each == 'd') {
				continue;
			
			}
		}
		*/
		
		/*
		int[] num1 = new int[3];
		int[] num2 = {1,2,3,4,5};
		num1 = num2;
		for(int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		*/
		
		/*
		int[] intArr = {15,30,45,60,75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		System.out.println(Arrays.toString(intArr));
		
		int x = intArr.length;
		System.out.println(x);
		*/
		
		
		int arr[] = {1,2,3,4};
		int i= 0;
		do {
			System.out.println(arr[i] + " ");
			i++;
		} while (i<arr.length-1);
		

	}

}
