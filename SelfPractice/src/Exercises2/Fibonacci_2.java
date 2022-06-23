package Exercises2;

import java.util.Scanner;

public class Fibonacci_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
			System.out.print("Enter n-th Fibonacci Number:");
			int num = sc.nextInt();
        
			sc.close();
        
			
			System.out.println(num+"th Fibonacci Number is: " + fibonacci(num));
			
    }

    
    public static int fibonacci(int num) {
        
    		if(num <= 1) {
            return num;
        	}
    		
    		return fibonacci(num-1) + fibonacci(num-2);
    		

	}

}
