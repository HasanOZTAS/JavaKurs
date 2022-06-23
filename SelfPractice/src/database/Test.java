package database;

import java.util.Scanner;

	

public class Test {
	
	
		static MyDatabaseManager MyDatabaseManager;
		
		
	public static void main(String[] args) {
		
					
		
		menu();
		
		Scanner scanner = new Scanner(System.in);
				
				int karar  = scanner.nextInt();
		
		switch (karar) {
		case 1: 			
			MyDatabaseManager = new MyDatabaseManager(new MyOracle());
			secenekler();
			int secim = scanner.nextInt();
			islem(secim);
			
			
			break;
		case 2:
			MyDatabaseManager = new MyDatabaseManager(new MySQL());
			secenekler();
			secim = scanner.nextInt();
			islem(secim);
			break;		
		default:
			System.out.println("Yanlýþ seçim");
			break;
		}
		
		
		

	}
	
	private static void islem(int secim) {
		
		switch (secim) {
		case 1:
			MyDatabaseManager.add();			
			break;
		case 2:
			MyDatabaseManager.delete();
			break;
		case 3:
			MyDatabaseManager.update();
			break;
		case 4:
			MyDatabaseManager.login();
			break;
		case 5:
			MyDatabaseManager.list();
			break;
		case 6:
			MyDatabaseManager.addUser("Hasan", "ÖZTAÞ", 1);
			MyDatabaseManager.addUser("Barýþ", "ALTUN", 2);
			break;
		case 7:
			MyDatabaseManager.getuser();
			break;
		default:
			break;
		}
		
	}

	public static void menu() {
		
		System.out.println("1- Oracle");
		System.out.println("2- MySql");
		System.out.println("Seçim yapýnýz");
		
	}
	
	public static void secenekler() {
		
		System.out.println("Yapmak istediðiniz iþlemi seçiniz");
		
		System.out.println("1-Ekle");
		System.out.println("2-Sil");
		System.out.println("3-Güncelle");
		System.out.println("4-Veri Tabaný Giriþ");
		System.out.println("5-Listele");
		System.out.println("6-Kullanýcý Ekleme");
		System.out.println("7-Kullanýcý Listeleme");
		
		
	}
	
	

}
