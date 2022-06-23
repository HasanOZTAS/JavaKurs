package day07_controlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int score = 60;
		
		if(score >=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		}else {
			
			System.out.println("Unfortunately");
			System.out.println("You failed");
		}
		
		
		System.out.println("*******");
		
		
		int sales, bonus;
		double commisionRate, salary;
		
		sales = 400;
		salary=1000;
		
		if(sales >500) {
			bonus =50;
			commisionRate=1.12;
			
			salary=salary*commisionRate+bonus;
			
		}else {
			bonus = 10;
			commisionRate=1.10;
		}
		System.out.println("Salary = " + salary);
		
		

	}

}
