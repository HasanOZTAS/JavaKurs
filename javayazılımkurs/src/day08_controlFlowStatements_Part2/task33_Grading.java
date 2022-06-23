package day08_controlFlowStatements_Part2;

public class task33_Grading {

	public static void main(String[] args) {
		
		int mark=95;
		
		if (mark>0 && mark < 60) {
			System.out.println("Fail");
		}else if (mark >= 60 && mark <90) {
			System.out.println("Pass");
		}else if (mark >= 90 && mark <=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Invalide Score");
		}
		
		
		
		
		

	}

}
