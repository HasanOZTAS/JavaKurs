package day19_stringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		
		String word = "Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word = word.concat("+Eclipse");
		System.out.println(word);
		
		word = word.concat(" Automation");
		System.out.println(word);	
		
		// word = word.concat(123);	error   just string
		word = word + 123;	//   no error    works
		
		word = word + true;  //  no error
		
		
		
		String word2 = "Hi";
		word2 = word2.concat("-Hey").concat("-How are you").concat("--Good");
		System.out.println(word2);
		

	}

}
