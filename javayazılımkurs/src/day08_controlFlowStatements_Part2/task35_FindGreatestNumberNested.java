package day08_controlFlowStatements_Part2;

public class task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		
		int n1=2000;
		int n2=1000;
		int n3=3000;
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is the greatest");			
		} else {
			if (n2>n3) {
				System.out.println("n2 is greatest");
			}else {
				System.out.println("n3 is greatest");
			}
		}
			
				
		
		
		
		
		
		

	}

}
