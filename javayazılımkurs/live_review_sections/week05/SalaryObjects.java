package week05;

public class SalaryObjects {

	public static void main(String[] args) {
		
		Salary salary1 = new Salary();  //  employee1
		salary1.setInfo(45, 40, 0.3);
		System.out.println(salary1);
		
		System.out.println();
		
		Salary salary2 = new Salary();  // employee2  
		salary2.setInfo(55, 45, 0.28);
		System.out.println(salary2);
		
		System.out.println();
		
		salary2.rate = 65;
		System.out.println(salary2);

	}

}
