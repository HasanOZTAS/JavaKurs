package day15_methods_Part3;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.err.println(sum(2,3,3));
		
		int x=sum(10,25,1);
		System.out.println(x);

	}
	
	public static int sum(int a, int b) {
		return a+b;		
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;		
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

}
