package day12_controlFlowStatements_Part6;

public class breakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=5;i++) {
			
			if (i==4) {
				break;
			}
			System.out.println(i);
		}
		
		
		System.out.println("*******");
		
			for (int i=1; i<=5;i++) {
			
				if (i==4) {
					continue;
				}
				System.out.println(i);
			}
		
		
		
		
		

	}

}
