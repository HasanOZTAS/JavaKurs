package database;

public class MyUsers {
	
	private String name;
	private String lastName;
	private int ID;
	
	
	
	public MyUsers(String name, String lastName, int iD) {
		
		this.name = name;
		this.lastName = lastName;
		ID = iD;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



	@Override
	public String toString() {
		return "MyUsers [name=" + name + ", lastName=" + lastName + ", ID=" + ID + "]";
	}
	
	
	
	
	
	
	
	
	

}
