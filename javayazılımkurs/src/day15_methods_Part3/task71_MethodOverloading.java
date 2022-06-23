package day15_methods_Part3;

public class task71_MethodOverloading {

	public static void main(String[] args) {
		
		// 1 inch=2.54cm
		// 1 feet=12 inches
		
		calcFeetAndInchesToCentimeters(1);
		
		calcFeetAndInchesToCentimeters(-6,5);
		calcFeetAndInchesToCentimeters(0,1);
		
		
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		 if (feet<0 || (inches<0 || inches>12)) {
			 System.out.println("Invalid feet on inches");
			 return -1;
		 }
		 
		 double centimeters=(feet*12)*2.54;
		 
		 System.out.println(feet + " feet, " + inches + " inches= " + centimeters + " centimeters");
		 
		 
		 return centimeters;
		 
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			System.out.println("Invalid inches");
			return -1;
		}
		double feet = (int)inches/12;
		double remainingInches = inches%12;
		
		System.out.println(inches + " inches " + feet + " feet and " + remainingInches + " inches");
		
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

}
