package week09;

public class Credentials {
	
	private String username, password;
	
	public String getUsername () {
		
		return username;
	}
	
	public void setUsername (String username) {
		
		if (username.length() < 8) {
			System.err.println("User name should be at least 8 characters long");
			return;
		}
		
		if (!username.endsWith("@gmail.com")) {
			System.err.println("User name must end with @gmail.com");
			return;
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		if (!Character.isLetter(password.charAt(0))) {
			System.err.println("Password must start with a letter");
			return;
		}
		
		this.password = password;
	}
	
	
	
	
	
	

}
