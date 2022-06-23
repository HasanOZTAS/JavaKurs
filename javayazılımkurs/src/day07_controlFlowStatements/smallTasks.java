package day07_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		//  Write an if statement that assigns 5 to x when y is equal to 20
		
		
		int x=10;
		int y=20;
		
		if(y==20) {
			x=5;
		}	
			System.out.println("x = " + x + " y = " + y);
			
		
		
		System.out.println("*******");
		
		//Write an if statement that multiplies pay rate by  1.5 if hours is greater than 40
		
		double payRate=2000;
		int hours=50;
		
		if(hours>40) {
			
			payRate=payRate*1.5;		
			
		}
			System.out.println("Pay Rate is " + payRate);
			
			
			System.out.println("*******");
			
			
		// Write an if statement that sets the variable fees to 50 if the boolean variable
		//	max is true
			
		boolean max = true;
		int fee = 20;
		
		if(max==true) {
			fee=50;			
		}
		System.out.println("Fee is " + fee);
		
		
		System.out.println("*******");
		
		// Write an if statement that assigns 20 to the variable a if variable b
		// is 50 or c is greater and equal to 100
		
		int a=50;
		int b=50;
		int c=60;
		
		if(b==50 || c>=100) {
			a=20;
		}
			System.out.println("a is " + a);
			
			System.out.println("*******");
			
			
			// Write an if statement that prints "Ideal Temp" if the temp is between
			// 70 an 80
			
		int temp =71;
		
		if (temp >= 70 && temp <80) {
			
			System.out.println("Ideal Temp");
		}
			
		System.out.println("*******");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
