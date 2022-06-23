package day19_stringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));	Gives error
		
		
		System.out.println("*******");
		
		// Check if first character is 'A'
		String word2 = "Apple";
		
		
		if (word2.charAt(0) == 'A') {
			System.out.println("First character is A");
		}else {
			System.out.println("First character is not A");
		}
		
		System.out.println("*******");
		
		
		// Check if the first and the last characters are same
		String word3 = "civic";
		
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("The first and the last characters are same");
		}else {
			System.out.println("The first and the last characters are not same");
		}
		
		
		System.out.println("*******");

		// Last index not hard coded
		
		System.out.println(word3.length());
		
		int lastCharr = word3.length();
		
		System.out.println("Last character is: " + (word3.charAt(lastCharr-1)));
		
		
		System.out.println("*******");
		
				
		String word4 = "Java Script";
		
		char lastChar = word4.charAt(word4.length()-1);
		
		System.out.println("Last char of " + word4 + " is: " + lastChar);
		

	}

}
