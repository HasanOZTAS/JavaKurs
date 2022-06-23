package week10;

public class StudentObjects {

	public static void main(String[] args) {
		
		System.out.println(CybertekStudent.schoolName);
		System.out.println(CybertekStudent.programmingLanguage);
		
		System.out.println();
		
		CybertekStudent student1 = new CybertekStudent("Hasan", 46, "EU5");
		System.out.println(student1);
		
		System.out.println();
		
		CybertekStudent student2 = new CybertekStudent("Ali", 45, "EU4");
		System.out.println(student2);
			
		System.out.println(student1);
		
		System.out.println("*******");
		
		student1.printSchoolName();
		System.out.println(student1.schoolName);
		student1.printName();		
		// System.out.println(student1.printSchoolName());  //  error
		
		System.out.println();
		
		student1.printNameAndLanguage();		
		// System.out.println(student1.printNameAndLanguage()); // error
		
		
		
		
		

	}

}
