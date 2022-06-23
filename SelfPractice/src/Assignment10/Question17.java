package Assignment10;



public class Question17 {

	public static void main(String[] args) {
		
		/*
		 Write a program that will print out letters 
		 in the alphabetic order accordingly to the given range within 2 chars.

		Sample Output:

     	input: A
     	input: Z
     	output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     	input: a
     	input: f
     	output: abcdef

     	input: a
     	input: d
     	output: abcd

     	input: B
     	input: O
     	output: BCDEFGHIJKLMNO
		 */
		
		
		orderChars('A', 'Z');
		orderChars('a', 'd');
		orderChars('B', 'O');
		
		
	}

	public static void orderChars(char firstChar, char secondChar) {
		
		for (char i=firstChar; i<=secondChar; i++) {
			System.out.print(i);
		}
		System.out.println();
		
	}

}
