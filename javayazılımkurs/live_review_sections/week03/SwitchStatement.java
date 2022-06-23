package week03;

public class SwitchStatement {
	
	public static void main(String [] args) {
		
		/*
		boolean b1= "Hello" == "Hola";
		boolean b2= 10 == 10;
		boolean b3= 'A'== 'a';
		
		double d1 = 10;
		double d2 = 10d;
		double d3 = 10D;
		
		float f = 10f;
		long l = 10l;
		*/
		
		int number = 10;
		
		switch (number) {
		//default:
			//System.out.println("D");
			//break;
		case 10:
			System.out.println("A");
			break;
		case 11:
			System.out.println("B");
			break;
		case 12:
			System.out.println("C");	
		default:
				System.out.println("D");
				break;		// not necessary at the end of switch case.
		
		}
		
		
		
		
		
		
		
	}
	
	

}
