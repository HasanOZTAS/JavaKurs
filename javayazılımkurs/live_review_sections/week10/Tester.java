package week10;

public class Tester extends Employee{

	public Tester(String name, String gender, String jobTitle, int employeeID, double salary) {
		super(name, gender, jobTitle, employeeID, salary );		
	}
	
	public void smoekTesting() {
		
		System.out.println(name + " is smoke testing.");
	}
	
	public void creatingTicket() {
		
		System.out.println(name + " is creating ticket.");
	}
		

}
