package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("Hasan", 213707);
		Employee e3 = new Employee("Ali", 213704, "Sales", "Sales Person");
		
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() 
										+ "|" + e1.getPosition());
		
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() 
										+ "|" + e2.getPosition());
		
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() 
										+ "|" + e3.getPosition());
		
		
		e1.setName("Mike");
		e1.setIdNumber(125254);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");
		
		
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() 
										+ "|" + e1.getPosition());
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	}

}
