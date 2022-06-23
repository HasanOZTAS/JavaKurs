package week03;

public class MethodPracticeReturn {

	public static void main(String[] args) {
		
		
		System.out.println(isEven(200));
		
		System.out.println("*******");
		
		System.out.println(factorialNumber1(5));
		
		System.out.println("*******");
		
		System.out.println(factorialNumber2(5));

	}
	
	public static boolean isEven(int number) {
		
		return (number%2==0) ? true: false;
		
	}
	
	public static int factorialNumber1(int number) {
		
		int result=1;
		
		for (int i=1; i<=number; i++) {
			result=result*i;
			
		}
		return result;
		
	}
	
	public static int factorialNumber2(int number) {
		
			int result = 1;
			
			while(number > 0) {
				result *= number;
				number--;
			}		
			return result;
	}

}
