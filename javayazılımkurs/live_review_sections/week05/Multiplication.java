package week05;

public class Multiplication {

	public static void main(String[] args) {
		
		/*
		 write a program that can multiply two numbers without using * operator
		*/
		
		int num1 = 40;
		int num2 = 7;
		
		int result = 0;
		
		for (int i=1; i<=num2; i++) {
			result+=num1;
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		
		

	}

}
