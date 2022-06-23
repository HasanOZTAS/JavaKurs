package day14_methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		
		System.out.println(sum(2,3));
		
		int v1 = sum(4,3);		// 3-Here it became global (v1)
								// 4-Now it can be used globally
		System.out.println(v1*5);
		
		System.out.println(v1);
		

	}
	
	public static int sum(int num1, int num2) {
				 // At first void must be changed
		int result;			// 1-Here it is global
		result = num1 + num2;
		
		return result;     // 2-Here it goes to global
						   // return 5;  can be	
		// After return can not be written code
		
	}

}
