package week10;

public class Developer extends Employee{

	public Developer(String name, String gender, String jobTitle, int employeeID, double salary) {
		super(name, gender, jobTitle, employeeID, salary);		
	}
	
	public void coding() {
		
		System.out.println(name + " coding.");
	}
	
	public void fixingBug() {
		
		System.out.println(name + " fixing bug.");
	}	
}
