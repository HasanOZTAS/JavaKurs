package week02;

public class IfStatements2 {

	public static void main(String[] args) {
		
		int score = 165;
		
		if (score >=0 && score<=100) {
			if (score>=90) {
				System.out.println("Excellent");
			}else if (score>= 70) {
				System.out.println("Good");
			}else if (score>=60) {
				System.out.println("Passed");
			}else {
				System.out.println("Fail");
			}
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		

	}

}
