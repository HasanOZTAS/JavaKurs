package week04;

import utility.StringUtility;

public class StringReverse {

	public static void main(String[] args) {
		
		String name = "Hasan";
		
		String reverse = "";	//  nasaH
		
		//reverse +=name.charAt(4);	// n
		reverse +=name.charAt(name.length()-1);
		reverse +=name.charAt(3);	// a
		reverse +=name.charAt(2);
		reverse +=name.charAt(1);
		reverse +=name.charAt(0);
		
		System.out.println(reverse);
		
		System.out.println();
		
		String str = "Java Programming Language";
		String result = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			result +=str.charAt(i);			
		}
		System.out.println(result);
		
		System.out.println("*******");
		
		String schoolName = "Cybertek School";
		
		String reversedSchoolName = StringUtility.reverse(schoolName);
		System.out.println(reversedSchoolName);
		
		System.out.println();
		
		String jobTitle = "Automation Engineer";
		String reversedJobTitle = StringUtility.reverse(jobTitle);
		
		System.out.println(reversedJobTitle);
		
		
		
		
		
		
		

	}

}
