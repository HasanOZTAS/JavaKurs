package week08;

public class Employee {
	
	public String name, jobtitle;
	public int ID;
	public double salary;
	
	
	
	
	public Employee(String name, String jobtitle, int iD, double salary) {
		
		this.name = name;
		this.jobtitle = jobtitle;
		ID = iD;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", jobtitle=" + jobtitle + ", ID=" + ID + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	

}
