package Exercises;

public class task62_GreaterNumber {

	public static void main(String[] args) {
		
		greaterNumber(100,12,13);

	}

	public static void greaterNumber(int a, int b, int c) {
		
		if(a==b || a==c || b==c) {
			System.out.println("Equal Numbers");
		}else if (a>b && a>c) {
			System.out.println("a is greater");
		}else if(b>a && b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
		
	}

}
