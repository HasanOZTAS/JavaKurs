package database;

public abstract class MyDatabase {
	
	
	public abstract void login();
	public abstract void add();
	public abstract void delete();
	public abstract void list();
	public abstract void update();
	public abstract void addUser(String ad, String soyad, int id);
	public abstract void getUser();
	
	

}
