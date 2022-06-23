package day15_methods_Part3;

public class assignment1_SwapValues {
	
	public static void main(String[] args) {
		
		
		// Using by 3rd variable
		int n1=10;
		int n2=20;
		int n3;
		
		n3=n1;  // 10
		n1=n2;  //  20
		n2=n3;  //  10
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		// without using 3rd variable
		
		int num1=10;
		int num2=20;
		
		num1=num1+num2;  // 30
		num2=num1-num2;  // 10
		num1=num1-num2;  // 20
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
