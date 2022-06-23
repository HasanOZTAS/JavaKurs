package day11_controlFlowStatements_Part5;

public class whileLoop {

	public static void main(String[] args) {
		
		int i=0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("*******");   //  both same
		
		for (int a=0; a<=10; a++) {
			System.out.println(a);
		}
		
		System.out.println("*******");
		
		
		int numberOfStudents=1;
		
		while (numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
		
		System.out.println("*******");
		
		//  Counting down
		int num=15;
		
		while (num>=1) {
			System.out.print(num + " ");
			num--;
		}
		
		
		
		
		

	}

}
