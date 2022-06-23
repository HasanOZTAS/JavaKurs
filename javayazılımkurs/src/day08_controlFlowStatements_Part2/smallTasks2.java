package day08_controlFlowStatements_Part2;

public class smallTasks2 {

	public static void main(String[] args) {
		
		// Write an if-else statement that assigns 20 to variable y if the variable
		// x is greater than 100. Otherwise, it should assign 0 to variable y.
		
		int x=101;
		int y=40;
		
		if(x > 100) {
			y=20;					
		}else {
			y=0;			
		}
			System.out.println("y = " + y);
		
		System.out.println("*******");
		
		// Write an if-else statement that assigns 1 to x when y is equal
		// to 100. Otherwise, it should assign 0 to x.
		
		int x1=5;
		int y1=10;
		
		if (y1 == 100) {
			x1=1;			
		}else {
			x1=0;
		}
			System.out.println("x1 = " + x1);
			
			System.out.println("*******");
			
			
		// Write an if-else statement that assigns 0 to the variable b and
		// assigns 1 to the variable c if the variable a is less than 10.
		// Otherwise, it should assign -99 to the variable b and assign 0 to the variable c.
			
			
		int a=11;
		int b=20;
		int c=30;
		
		if(a < 10) {
			b=0;
			c=1;
		}else {
			b=-99;
			c=0;
		}
			System.out.println("b = " + b + " c = " + c);
			
			
			
		
		
		

	}

}
