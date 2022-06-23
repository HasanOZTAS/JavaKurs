package week06;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		boolean isAnagram = Arrays.equals(ch1,  ch2);
		System.out.println(isAnagram);
		
		Arrays.sort(ch1);;
		Arrays.sort(ch2);
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		boolean isAnagram1 = Arrays.equals(ch1,  ch2);
		System.out.println(isAnagram1);

	}

}
