package day07_controlFlowStatements;

public class watermelon {

	public static void main(String[] args) {
		
		int numberOfWaterMelon;
		boolean lotsOfWaterMelon;
		lotsOfWaterMelon=false;
		
		numberOfWaterMelon=19;
		
		if (numberOfWaterMelon>=20) {
			System.out.println("I have more than 20 watermelon");
			lotsOfWaterMelon=true;
		}
		
		if (lotsOfWaterMelon) {
			System.out.println("Good Job");
		}
		
		if (lotsOfWaterMelon == false) {
			System.out.println("I need more watermelon");
		}
		
		
		

	}

}
