package day08_controlFlowStatements_Part2;

public class nestedIfStatement {

	public static void main(String[] args) {
		
		boolean isRushHour=false;
		int carType=3;
		double price=0.0;
		
		if (carType ==1) {
			if (isRushHour) {
				price=30.0;
			}else {
				price=15.0;
			}
		}else if (carType==2) {
			 if (isRushHour) {
				 price=55.50;
			 }else {
				 price=15.75;
			 }
		}else if (carType==3) {
			  if (isRushHour) {
				  price=45.60;
			  } else {
				  price=32.20;
			  }
		}
		System.out.println("Toll Cost: " + price);
		
		
		
		
		
		
		

	}

}
