package week04;

public class RemoveDuplictaes {

	public static void main(String[] args) {
		
		String str = "aabbcc";
		String result = "" ;	// abc
		
		
		for (int i=0; i<str.length(); i++) {
			String each = ""+ str.charAt(i);			
			
			if (result.contains(each)) {
				continue;
			}
			result+= each;
		}
		System.out.println(result);
		
		

	}

}
