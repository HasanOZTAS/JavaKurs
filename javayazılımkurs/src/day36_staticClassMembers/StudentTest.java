package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike",30,1000);
		Student s2 = new Student("Hasan",20,1200);
		Student s3 = new Student("Ali",10,1500);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println();
		
		s1.school = "CybertekEU";  // effects all the others
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		

	}

}
