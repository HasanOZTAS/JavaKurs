package day16_classObjects;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.name = "Hasan";
		employee1.jobTitle = "Director";
		employee1.salary = 2500;
		
		System.out.println("Name: " + employee1.name);
		System.out.println("Position: " + employee1.jobTitle);
		System.out.println("Salary:" + employee1.salary);
		
		System.out.println();
		
		employee1.work();
		employee1.attendMeeting();
		employee1.introduce();
		
		System.out.println("*******");
		
		Employee employee2 = new Employee();
		
		employee2.name = "Niyazi";
		employee2.jobTitle = "Maraba";
		employee2.salary = 1500;
		
		employee2.introduce();
		employee2.work();
		employee2.attendMeeting();
		
		System.out.println();
		
		System.out.println("Name: " + employee2.name);
		System.out.println("Job Title. " + employee2.jobTitle);
		System.out.println("Salary: " + employee2.salary);

	}

}
