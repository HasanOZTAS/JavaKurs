package week10;

public class CybertekStudent {
	
	public String name;
	public int age;
	public static String batch;
	
	public static String schoolName;
	public static String programmingLanguage;
	
	public CybertekStudent(String name, int age, String batch) {
		
		this.name = name;
		this.age = age;
		this.batch = batch;
	}
	
	static {
		schoolName = "Cybertek School";
		programmingLanguage = "Java";
	}
	
	public void printName() {
		
		System.out.println("Student Name: " + name);
	}
	
	public static void printSchoolName() {
		
		System.out.println("School Name: " + schoolName);
	}
	
	public void printNameAndLanguage() {  //  instance method
		
		System.out.println("Studen Name: " + name);  //  instance variable
		System.out.println("Programming Language: " + programmingLanguage); // static variable
	}

	
	public String toString() {
		return "CybertekStudent [Name=" + name + ", Age=" + age + ", Batch=" + batch + "]";
	}
	
	
	
	
	
	
	
	

}
