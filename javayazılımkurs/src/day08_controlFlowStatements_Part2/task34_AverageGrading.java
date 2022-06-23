package day08_controlFlowStatements_Part2;

public class task34_AverageGrading {

	public static void main(String[] args) {
		
		int math=100;
		int chemistry=10;
		int biology=90;
		
		double average = (math+chemistry+biology) /3;
		System.out.println("Average is " + average);
		
		if (average>=90 && average<=100) {
			System.out.println("Grade is A");
		}else if (average>=80 && average<90) {
			System.out.println("Grade is B");
		}else if (average>=70 && average<80) {
			System.out.println("Grade is C");
		}else if (average >=60 && average<70) {
			System.out.println("Grade is D");
		}else if (average >= 0 && average<60) {
			System.out.println("Grade is F");
		}else {
			System.out.println("Invalid Mark");
		}
		
		
		
		
		
		

	}

}
