package week05;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		/*
		write a program that can return the frequency of characters from a string
			    Ex:
			        str = "aaabbcccc"

			        output:
			            a3b2c4
		*/
		
		String str = "aaabbcccc";
		String result = "";
		
		for (int j=0; j<str.length(); j++) {
		
			char ch = str.charAt(j);
			int count = 0;
			for (int i=0; i<str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if(!result.contains(""+ch)) {
			result+= ch + "" + count;
			}
		}
		
		System.out.println(result);
		

	}

}
