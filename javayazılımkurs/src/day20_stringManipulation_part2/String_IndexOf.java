package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(java.lang.String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		System.out.println();
		
		String url = "www.okta.com";
		int i =url.indexOf(".");
		System.out.println("Pos of . " + i);
		
		System.out.println(url.charAt(i+1));
		
		System.out.println("*******");
		
		//find positon of '-' and check if space is on right and left side
		String title = "Java - Google Search";
		
		int dash=title.indexOf('-');
		System.out.println("\"" + title.charAt(dash-1) + "\"");
		System.out.println("\"" + title.charAt(dash+1) + "\"");
		
		System.out.println("*******");
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: " + states);
		
		System.out.println("*******");
		
		String word2= "java, c++, python, tomcat, eclipse";
		// check if c++ is in the word2
		
		System.out.println(word2.contains("c++"));
		System.out.println(word2.indexOf("c++"));
		
		if (word2.contains("c++")) {
			System.out.println("c++ exists");
		}else {
			System.out.println("c++ doesn't exist");
		}
		
		System.out.println();
		
		if (word2.indexOf("c++") > -1) { 	// or !=
			System.out.println("c++ exists");
		}else  {
			System.out.println("c++ doesn't exist");
		}
		
		
		
		
		
		

	}

}
