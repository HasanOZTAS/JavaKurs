package day13_methods_Part1;

public class task60_Calculator {

	public static void main(String[] args) {
		
		calculator(12,6,"/");
		calculator(12,6,"*");
		calculator(12,6,"+");
		calculator(12,6,"-");
		

	}

	public static void calculator(int num1, int num2, String operator) {
		
		switch (operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			 System.out.println(num1*num2);
			 break;
		case "/":
			 System.out.println(num1/num2);
			 break;			
		}				
		
	}

}
