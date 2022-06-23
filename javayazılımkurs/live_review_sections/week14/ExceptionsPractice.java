package week14;

import java.io.FileInputStream;
import java.util.Arrays;

public class ExceptionsPractice {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new int[] {1,2,3}));
		//System.out.println(new int[] {1,2,3} [5]);	//java.lang.ArrayIndexOutOfBoundsException
		
		//System.out.println(100/0);	// java.lang.ArithmeticException
		
		System.out.println("Hello");
		//FileInputStream file = new FileInputStream("");	// checked exception -- FileNotFoundException
															// previous or after, none of the codes run.
		
		//Thread.sleep(1000);	// checked exception
		
		
		
		
	}

}
