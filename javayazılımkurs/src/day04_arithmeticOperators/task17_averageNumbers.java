package day04_arithmeticOperators;

public class task17_averageNumbers {

	public static void main(String[] args) {
		
		double average;
		int num1, num2, num3;
		num1=2000;
		num2=2000;
		num3=5000;
		
		average = (num1+num2+num2)/3;
		
		System.out.println("Average is "+ average);
		
		//System.out.println("Average is " + (num1+num2+num3)/3 );
		
		
		
		int x = 130;
		//byte b = x;    does not compile
		byte b = (byte)x;
		
		System.out.println(b);
		
		int pies=10, people=4;
		double piecesPerson;
		piecesPerson= (double) pies/people;
		System.out.println(piecesPerson);
		
		
		int pies1=10, people1=4;
		double piecesPerson1;
		piecesPerson1= pies1/ (double)people1;  // int/double=double
		System.out.println(piecesPerson1);
		
				
		

	}

}
