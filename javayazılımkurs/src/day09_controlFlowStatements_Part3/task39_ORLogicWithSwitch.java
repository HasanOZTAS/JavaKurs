package day09_controlFlowStatements_Part3;

public class task39_ORLogicWithSwitch {

	public static void main(String[] args) {
		
		char trafficLights= 'g';
		
		switch (trafficLights) {
		
//		case "R":
//			System.out.println("Red");
//			break;
//		case "r":
//			System.out.println("Red");
//			break;
		
		case 'R':
		case 'r':
			System.out.println("Red");
		case 'O':       case 'o':
			System.out.println("Orange");
			break;
		case 'G':case 'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Invalid letter");
		
		}
		
		

	}

}
