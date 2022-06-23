package day13_methods_Part1;

public class task61_AgeCalculator {

	public static void main(String[] args) {
		
		calculateAge(2021,2000);

	}

	public static void calculateAge(int currentYear, int birthYear) {
		int age = currentYear - birthYear;
		System.out.println(age);
		
	}

}
