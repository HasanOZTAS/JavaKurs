package week02;

public class Ternary {

	public static void main(String[] args) {
		
		int num=1001;
		
		String result="";
		
		if(num%2==0) {
			result="Even";
		}else {
			result = "Odd";
		}
		System.out.println(result);
		
		
		System.out.println("*******");
		
		
		String result2= (num %2 == 0) ? "Even" : "Odd";
		System.out.println(result2);
		
		
		System.out.println("*******");
		
		// positive, negative or zero
		
		int n=-00;
		
		String number= n <0 ? "Negative" : (n==0) ? "Zero" :  "Positive";
		System.out.println(number);
		
		
		System.out.println("*******");
		
		
		//  Days of week
		
		int d=5;
		String day = (d == 1) ? "Monday"   : (d == 2) ? "Tuesday" : (d==3) ? "Wednesday" :
					 (d == 4) ? "Thursday" : (d == 5) ? "Friday"  : (d==6) ? "Saturday"  :
					 (d == 7) ? "Sunday"   : "Invalid Day";
		
		System.out.println(day);
		
		
		System.out.println("*******");
		
		int a=100, b=120, c=30;
		
		int max = (a>b && a>c) ? a : (b>a && b>c) ? b : c;
		int min = (a<b &&a <c) ? a : (b<a && b<c) ? b : c;
		
		System.out.println("Max is " + max + "  Min is " + min);
		
		
		
		
		
		
		
		

	}

}
