package week09;

public class Accounts {
	
	public static void main(String[] args) {
		
		Credentials facebook = new Credentials();
		//facebook.username = "123";
		//facebook.password = "9876";
		
		facebook.setUsername("cybertekschool@yahoo.com");
		
		System.out.println(facebook.getUsername());
		
		facebook.setPassword("9876");
		System.out.println(facebook.getPassword());
		
		
		
	}

}
