package week06;

public class BranchingStatements {

	public static void main(String[] args) {
		
		System.err.println("Test Started");
		
		method1();		
		
		System.out.println("Test Completed");
	}

	public static void method1() {
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hello World");
			//break;		//  exits the loop
			//return;		//  exits the method
			System.exit(0);	//  Terminates everything
		}
		
	}

}
