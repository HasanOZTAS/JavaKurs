package day13_methods_Part1;

public class task58_greaterNumber {

	public static void main(String[] args) {
		
		greaterNum();

	}

	public static void greaterNum() {
		
		int num1=61;
		int num2=60;
		
		if (num1>num2) {
			System.out.println("Num1 is greater");
		}else if(num2>num1){
			System.out.println("Num2 is greater");
		}else {
			System.out.println("Numbers are equal");
		}
		
	}

}
