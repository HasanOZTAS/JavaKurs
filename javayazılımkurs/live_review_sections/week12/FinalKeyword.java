package week12;


class Test{
	
	protected void method() {
		
		System.out.println("Good Morning");
		
	}
	
	
	
	
}

public class FinalKeyword extends Test{
	
	@Override
	public void method() {
		
		System.out.println("Good Evening");
	}
	
	
	
	
	
	
	final int b;  // needs to be initialized before using
		final static int c;
		
				
		public FinalKeyword (int b) {
			this.b = b;			
		}
		
		static {
			c = 200;
		}
	

	public static void main(String[] args) {
		
		final int a;
		a = 100;
		//a = 200;
		System.out.println(a);
		
		final String DATE_OF_BIRTH = "May/20/1975" ;
		// dateOfBirth = "Jun/20/1975";  //  error, cannot be changed or re-assigned
		
		final char gender = 'M';
		// gender = 'F';
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		
		
		
		
		
		
		
		

	}

}
