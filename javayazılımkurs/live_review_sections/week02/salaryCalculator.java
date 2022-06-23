package week02;

public class salaryCalculator {

	public static void main(String[] args) {
		
		/*
		 Task1: Arithmetic operators
    Create a class called SalaryCalculator, write a program that can
     calculate the tax, and salary after tax based on the hourly rate & tax rate
                ex:
                         rate = 55;
                        taxRate = 0.3;         weeklyHours = 40;

                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD

                Assume that a year has 48 weeks (excluding PTO)
		 */
		
		
		int rate=60;
		double taxRate=0.3;
		int weeklyHours=40;
		
		int salary=(rate*weeklyHours*43);
		double totalTax=salary*taxRate;
		double income=salary-totalTax;
		
		System.out.println("Your salary is: $" + salary);
		
		System.out.println("Your total tax is: $" + totalTax);
		
		System.out.println("Your incom after tax is $" + income);
		
		//  monthly salary
		
		double monthlySalary=income/12;
		System.out.println("Your monthly salary is $" + monthlySalary);
		
		
		
		

	}

}
