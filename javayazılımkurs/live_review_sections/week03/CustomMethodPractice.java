package week03;

public class CustomMethodPractice {

	public static void main(String[] args) {
		
		int person1 = 10;
		int person2 = 20;
		int person3 = 30;
		
		
		eligibleOrNot (15);
	}
	
	public static void eligibleOrNot(int age) {
		
		if (age>=21) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
	}

}
