package database;

public class MyDatabaseManager {
	
	private MyDatabase database;

	public MyDatabaseManager(MyDatabase database) {
		
		this.database = database;
	}
	
	public void login() {
		
		database.login();
	}

	public void add() {
		
		database.add();
		
	}

	public void delete() {
		
		database.delete();
		
	}

	public void update() {
		
		database.update();
		
	}

	public void list() {
		
		database.list();
		
	}
	
	public void addUser(String ad, String soyad, int id) {
		
		database.addUser(ad, soyad, id);
	}

	public void getuser() {
	
		database.getUser();
}
	
	

}
