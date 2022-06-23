package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		// Languages 
		// Print size of the arrayList
		// Read some of the elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Turkish");
		languages.add("English");
		languages.add("Arabic");
		languages.add("French");
		languages.add("German");
		
		System.out.println("Number of values: " + languages.size());
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		System.out.println(languages.get(2));
		System.out.println(languages.get(3));
		System.out.println(languages.get(4));
		
		System.out.println(languages);
		System.out.println(languages.toString());
		
		languages.add("Russian");
		System.out.println(languages);
		
		languages.remove(1);
		languages.remove(3);
		System.out.println(languages);		
		System.out.println("Number of values: " + languages.size());
		
		languages.remove(languages.size()-1);
		System.out.println(languages);
		
		
		
		

	}

}
