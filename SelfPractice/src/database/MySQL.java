package database;

import java.util.ArrayList;

public class MySQL extends MyDatabase{

	
	ArrayList<MyUsers> mySqlUser = new ArrayList<>();
	
	
	public void addUser(String ad, String soyad, int id) {
		
		mySqlUser.add(new MyUsers(ad, soyad, id));
		
		System.out.println(mySqlUser);
	}
	
	
	@Override
	public void login() {
		
		System.out.println("MySQL giriþ");
	}

	@Override
	public void add() {
		
		System.out.println("MySQL ekle");
	}

	@Override
	public void delete() {
		
		System.out.println("MySQL sil");
	}

	@Override
	public void update() {
		
		System.out.println("MySQL güncelle");
	}

	@Override
	public void list() {
		
		System.out.println("MySQL listele");
	}


	@Override
	public void getUser() {
		
		System.out.println(mySqlUser);
	}
	
	

}
