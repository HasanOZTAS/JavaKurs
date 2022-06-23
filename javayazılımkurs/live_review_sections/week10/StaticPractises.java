package week10;

import java.util.ArrayList;

public class StaticPractises {
	
	static class Abc{  //  inner class.  can be called by outer class name if static
					   //  only accepts static members of outer class.
		
	}
	
	String name;
	static int b;
	static String str = "Word";
	
	static ArrayList<String> names;  // must be static here.
				
	
	static {
		names = new ArrayList<>();
		names.add("Ali");
		names.add("Veli");
		str = "word";
		b = 15;
		// name = "Hasan";  // error -- name is non static, it is instance.
	}	
	
	
	public static void printName () {
		
		// System.out.println(name);  //  error-- name is instance variable
		// System.out.println(this.name);
		
		System.out.println(new StaticPractises().name);  // name is assigned to an object
	}
	
	public void printNames () {
		
		System.out.println(name);
		System.out.println(b);
		System.out.println(str);
		System.out.println(names);
	}
	
	

}
