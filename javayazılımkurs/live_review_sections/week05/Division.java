package week05;

public class Division {

	public static void main(String[] args) {
		
		int a=1000;
		int b=0;
		
		
		if (b != 0) {
		int count=0;
		while (a>=b) {
			a-=b;
			count++;
		}
		
		System.out.println(count);
		}else {
		System.out.println("Invalid Number");
		}
		

	}

}
