package day13_methods_Part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x = 10;
		
		displayValue(15);
		
		displayValue(x);
		
		displayValue(x*4);
		
		displayValue(2*3);
		

	}
	
	public static void displayValue(int num) {
		
		System.out.println("The value is " + num);
		
	}

}
