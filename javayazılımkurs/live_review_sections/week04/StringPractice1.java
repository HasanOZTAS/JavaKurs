package week04;

import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {
		
		String str1 = "Java";	// literal
		String str2 = "Java";
		String str3 = "Java";
		
		System.out.println(str1 == str2);	//
		System.out.println(str2 == str3);	//  true
		System.out.println(str2 == str3);	//
		
		System.out.println("*******");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = new String("Java");
		
		System.out.println(s1 == s2);	//
		System.out.println(s1 == s2);	//  false
		System.out.println(s1 == s3);	//
		
		System.out.println("*******");
		
		String s4 = new Scanner(System.in).next();
		
		System.out.println(s4 == s1);
		System.out.println(str1 == s4);
		
		

	}

}
