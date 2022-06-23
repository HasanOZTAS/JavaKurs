package database;

import java.util.ArrayList;

public class MyOracle extends MyDatabase{

	
	ArrayList<MyUsers> myOracleUser = new ArrayList<>();
	
	
	public void addUser(String ad, String soyad, int id) {
		
		myOracleUser.add(new MyUsers(ad, soyad, id));
		
		System.out.println(myOracleUser);
	}




	
	@Override
	public void login() {
		
		System.out.println("MyOracle giriþ");
	}

	@Override
	public void add() {
		
		System.out.println("MyOracle ekle");
	}

	@Override
	public void delete() {
		
		System.out.println("MyOracle sil");
	}

	@Override
	public void update() {
		
		System.out.println("MyOracle güncelle");
	}

	@Override
	public void list() {
		
		System.out.println("Oracle listele");
	}



	@Override
	public void getUser() {
		
		System.out.println(myOracleUser);		
	}
}
