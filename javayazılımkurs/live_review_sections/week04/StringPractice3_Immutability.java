package week04;

public class StringPractice3_Immutability {

	public static void main(String[] args) {
		
		String str = "Cybertek";
		
		str.concat("School");
		
		System.out.println(str); //----->  Cybertek
		
		str = str.concat(" School");
		
		System.out.println(str); //---->  Cybertek School
		
		System.out.println("*******");
		
		String s1 = "EU batch 5";
		s1.toUpperCase();		// EU BATCH 5
		
		System.out.println(s1);	// EU batch 5
		
		s1 = s1.toUpperCase();
		System.out.println(s1);	//  EU BATCH 5
		
		

	}

}
