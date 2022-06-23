package day19_stringManipulation_part1;

public class task76_PrintingEachCharacter {

	public static void main(String[] args) {
		
		String str = "Cybertek School";
		int a = str.length();
		
		for (int i=0; i<a; i++) {	// a=str.length
			System.out.print(str.charAt(i) + " ");
		}
		
		

	}

}
