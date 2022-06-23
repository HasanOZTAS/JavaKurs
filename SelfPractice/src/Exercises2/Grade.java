package Exercises2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);

	    System.out.println("Welcome to the Grader!");
	    
	    System.out.println("Please enter subject name number 1 and score for this subject");
	    String str1 = grade.next();
	    Double score1 = grade.nextDouble();	   
	    	    

	    System.out.println("Please enter subject name number 2 and score for this subject");
	    String str2 = grade.next();	    
	    Double score2 = grade.nextDouble();	    
	    
	    
	    System.out.println("Please enter subject name number 3 and score for this subject");
	    String str3 = grade.next();	    
	    Double score3 = grade.nextDouble();	    
	    

	    System.out.println("Please enter subject name number 4 and score for this subject");
	    String str4 = grade.next();	    
	    Double score4 = grade.nextDouble();
	    
	    

	    System.out.println("Please enter subject name number 5 and score for this subject");
	    String str5 = grade.next();	    
	    Double score5 = grade.nextDouble();
	    
	    

	    System.out.println("Summary: " + str1+ " - " + score1 + ", " + str2 + " - " + score2 + ", " + str3 + " - " + score3 + ", " + str4 + " - " + score4 + " , " + str5 + "- " + score5);
	    System.out.println("Your average score is: " + (score1+score2+score3+score4+score5)/5);
	    System.out.println("Thank you for using Grader!");
	    System.out.println("Goodbye!");

	}

}
