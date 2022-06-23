package day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person hasan = new Person();
		
		hasan.setName("Hasan");
		hasan.setAge(46);		
		hasan.setGender('M');
		
		System.out.println(hasan.getName());
		System.out.println(hasan.getAge());
		System.out.println(hasan.getGender());
		
		System.out.println();
		
		System.out.println(hasan.getName() + ", " + hasan.getAge() + ", " + hasan.getGender());
		
		

	}

}
