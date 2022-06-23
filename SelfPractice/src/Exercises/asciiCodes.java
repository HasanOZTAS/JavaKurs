package Exercises;

public class asciiCodes {

	public static void main(String[] args) {
		
		
		// Write a program to check whether a entered number is
		//defined ASCII character or not based on https://www.ascii-code.com/
		
		
		
		 char c= 155;

	        if (c>=0 && c<=255) {
	            if (c>=0 && c<=31) {
	                System.out.println(c + " this is ASCII control characters");
	                }
	            if (c>=32 && c<=127) {
	                if (c>=48 && c<=57) {
	                    System.out.println(c+" is a number");
	                }else if(c>=65 && c<=90) {System.out.println(c+" is an uppercase letter");

	                }else if (c>=97 && c<=122) {System.out.println(c+" is a Lowercase letter");

	                }else {System.out.println(c+" This is an ASCII printable characters");
	                }
	            }
	            if(c>=128 && c<=255) {System.out.println(c+ " This is an ASCII extended code");
	            }
	         }else {System.out.println(c+ " This is not an ASCII code");
	            } 
	    }
}

	




