package day09_controlFlowStatements_Part3;

public class ifElseRules {

	public static void main(String[] args) {
		
		
		/*
		This code can run without curly braces
		Because there is only one statement*/
		
		if (false)
			System.out.println("Hello");
		else 
			System.out.println("Bye");
		
		
		System.out.println("*******");
		
		if(false)
			System.out.println("Hello");  // if there is no curly braces first one doesn't run
			System.out.println("World");  // this line is not inside if statement
		//	else --- error
		
	}

}
