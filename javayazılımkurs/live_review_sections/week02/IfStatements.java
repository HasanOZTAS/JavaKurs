package week02;

public class IfStatements {

	public static void main(String[] args) {
		
		int a=110, b=120, c=130;
		
		if(a>b && a>c) {
			System.out.println("a is larger");
		}else if(b>a && b>c) {
			System.out.println("b is larger");
		}else {
			System.out.println("c is larger");
		}
		
		System.out.println("*******");
		
		
		int num=1001;     // odd or even number
		
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd  Number");
		}
		
		System.out.println("*******");
		
		//  zero, negative or positive
		int aa=-000;
		
		if (aa==0) {
			System.out.println("Zero");
		}else if (aa<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
		
		
		

	}

}
