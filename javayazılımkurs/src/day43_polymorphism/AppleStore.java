package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code();  //  Error -- not exists in Parent Class
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		//watch.Code();  //  Error -- not exists in Parent Class

	}

}
