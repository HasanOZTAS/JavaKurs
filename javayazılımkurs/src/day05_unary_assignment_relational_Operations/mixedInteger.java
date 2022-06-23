package day05_unary_assignment_relational_Operations;

public class mixedInteger {

	public static void main(String[] args) {
		
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 =i1 + f1;
		double res3 = i2 + d1;
		
		
		
		short firstNumber = 10;
		short secondNumber = 20;
		
		int thirdNumber = firstNumber + secondNumber;  // short---error
				//  or casting
		short thirdNumber2 = (short)(firstNumber + secondNumber);
		
		
		
		byte b1=20;
		byte b2=6;
		
		
		byte b3 =(byte) (b1*b2);
		System.out.println(b3);
		
		
		int h1 = 20;
		int h2 = 30;
		
		//byte res =h1 + h2:  //  error
		byte res =(byte) (b1 + b2);
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
