package day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Hello world");
		
		//throw new RuntimeException("This is an exception");
		
		//throw new Exception("Another exception");		//  checked exception-- 1-Handle-try/catch  2-Declare-throws declaration

		
		/*
		String username = "";
		
		if (username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid username");
		}
		*/
		
		
		sleep2(2);		//  Checked exception -- Handle or Declare (declared)
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		
		Thread.sleep(seconds * 1000);	//  Checked exception -- Declared
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		
		sleep(seconds);		//  Checked exception -- Declared
	}
	
	public static void sleep3(int seconds) {
		
		try {
			sleep2(seconds);		//  Checked exception -- Handled--try/catch
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
	}
	
	
	
	
	
	
	
	
	
	

}
