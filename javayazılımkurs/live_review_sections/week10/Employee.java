package week10;

public class Employee {
	
	public String name,
				gender,
				jobTitle;
	public int employeeID;	
	public double salary;
	public static boolean isEmployed = true;
	
	public Employee(String name, String gender, String jobTitle, int employeeID, double salary) {
		
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public void eat() {
		
		System.out.println(name + " is eating.");
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	public void work() {
		System.out.println(name + " working.");
	}

	
	public String toString() {
		return "Employee [Name=" + name + ", Gender=" + gender + ", JobTitle=" + jobTitle + ", EmployeeID=" + employeeID
				+ ", Salary=" + salary + "]";
	}
	
	

}
