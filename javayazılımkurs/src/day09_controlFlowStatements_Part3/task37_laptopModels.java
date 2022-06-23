package day09_controlFlowStatements_Part3;

public class task37_laptopModels {

	public static void main(String[] args) {
		
		String laptop="Apple";
		
		switch (laptop) {
		
		case "Apple":
			System.out.println("Apple no virus");
			break;
		case "Dell":
			System.out.println("Tough one");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default :
			System.out.println("Don't buy that one");			
			
		}
		
		
		
	}

}
