package day15_methods_Part3;

public class task68_Retirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("Hasan",1975);
		
		
		
	}
	
	public static int calculateAge(int yearBirth) {
		
		return 2021-yearBirth;
		
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementAge=65 - calculateAge(year);
		System.out.println(name + " retires in " + retirementAge + " years");
		
		
	}

}
