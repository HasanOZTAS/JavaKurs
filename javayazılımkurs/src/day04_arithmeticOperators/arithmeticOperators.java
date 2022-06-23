package day04_arithmeticOperators;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		//Addition Operator +
		
		System.out.println(55+5);
		
		int chairs=140;
		System.out.println(chairs+2);
		chairs=chairs+2;
		
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		System.out.println();
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		System.out.println();
		
		//Subtraction -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;  //same
		System.out.println(balance);
		
		System.out.println();
		
		//Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		int linesofCode=50;
		System.out.println("Lines of code " + linesofCode);
		
		linesofCode=linesofCode-2;
		System.out.println("Lines of code "+ linesofCode);
		
		System.out.println();
		
		//Multiplication * 
		System.out.println(22*5);
		
		int classes = 5;
		System.out.println(linesofCode * classes);
		int totalLinesOfCode=linesofCode * classes;
		System.out.println("Total Lines of Codes = "+ totalLinesOfCode);
		
		
		System.out.println();
		
		//Division /
		System.out.println(100/5);
		System.out.println(400/8);
		
		//System.out.println(11/0); //gives error while running the code
		System.out.println(11*0);  //no error
		
		System.out.println();
		
		
		//Remainder %
		System.out.println(100%20);
		System.out.println(9%2);
		
		
		
		
		

	}

}
