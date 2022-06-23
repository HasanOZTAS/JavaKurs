package week01;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		/*Task01. create a class called EmployeeInfo:
  		1. declare the following variables: name, gender, isMarried, 
  		companyName, employeeId, jobTitle, 
  		2. print:
        your company's name
        your Name
        your employee Id
        your job title
        your salary
		*/
		
		
		
		String name = "Hasan OZTAS";
		String companyName = "HSZTS";
		String jobTitle = "Director";
		char gender = 'M';
		int salary = 10000;
		int employeeId = 254263;
		boolean hasBenefits = true;
		boolean isMarried = false;
		
		
		
		System.out.println("Employee name is: " + name);
		System.out.println("Emyployee gender is: " +gender);
		System.out.println("Company name is: " + companyName);
		System.out.println("Employee ID is: " + employeeId);
		// System.out.println("Employee job title is : " + jobTitle);
		System.out.println(name+ "wants to be " + jobTitle);		
		System.out.println(name + "wants to make $ " +salary+ "a year");
		System.out.println("Employee is married: " + isMarried);
		System.out.println(hasBenefits);
		
		
		
		
		
		
		//  System.out.println(12+ "2");  132
		//  System.out.println(1+1+"1");  21
		//  System.out.println(1+1+1);   3
		
		

	}

}
