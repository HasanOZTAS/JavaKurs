package week04;

import utility.StringUtility;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "Anna";
		boolean isPalindrome =  StringUtility.reverse(word).equalsIgnoreCase(word);
		
		System.out.println(isPalindrome);
		
		
		System.out.println("----------------------------------");
		
		System.out.println( StringUtility.isPalindrome("Muhtar") );
		
		
		

	}

}
