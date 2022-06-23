package day11_controlFlowStatements_Part5;

public class task53 {

	public static void main(String[] args) {
		
		int a=0;
		int sumEven=0;
		
		while (a<100) {
			if(a%2==0) {
				sumEven = sumEven + a;
			}a++;
						
		}
		System.out.println(sumEven);		

	}

}
