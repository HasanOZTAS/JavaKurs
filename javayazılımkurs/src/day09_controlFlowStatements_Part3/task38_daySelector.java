package day09_controlFlowStatements_Part3;

public class task38_daySelector {

	public static void main(String[] args) {
		
		int day=3;
		
		switch (day) {
		case 1:
			System.out.println("1-Monday");
			break;
		case 2:		System.out.println("2-Thursday");
			break;
		case 3:
			System.out.println("3-Wednesday");
			break;
		case 4:
			System.out.println("4-Thursday");
			break;
		case 5:		System.out.println("5-Friday");
			break;
		case 6:
			System.out.println("6-Saturday");
			break;
		case 7:
			System.out.println("7-Sunday");
			break;
		default:	System.out.println("Enter a valid number");
			
		}
		
		
	}

}
