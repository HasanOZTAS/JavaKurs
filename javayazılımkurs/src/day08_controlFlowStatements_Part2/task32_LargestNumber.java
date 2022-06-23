package day08_controlFlowStatements_Part2;

public class task32_LargestNumber {

	public static void main(String[] args) {
		
		int a=1300;
		int b=210;
		int c=1300;
		
		if (a>b && a>c) {
			System.out.println("a is the greatest");
		}else if (b>a && b>c) {
			System.out.println("b is the greatest");
		}else if (c>a && c>a) {
			System.out.println("c is the greatest");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		

	}

}
