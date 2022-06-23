package day36_staticClassMembers;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	
	public static void show1 () {
	//	show2();  // instance methods or variables cannot be called from static methods.
		show4();  // static methods can be called from static methods.
		System.out.println(name);
		//System.out.println(age);  //  error
		
	}
	
	public void show2 () {
		show1();  // static methods can be called from instance methods.
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void show3 () {
		show1();
		show2();
		show3();
		show4();
		
	}
	
	public static void show4 () {
		
		
	}

}
