package Exercises;

public class task64_PrintStar {

	public static void main(String[] args) {
		
		printStar(9);

	}

	public static void printStar(int i) {
		
		for (int a=1; a<=i; a++) {
			for(int j=1; j<=a; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	}

}
