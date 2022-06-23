package week02;

public class IfStatements3 {

	public static void main(String[] args) {
		
		int month =-3;

		// 30 days: 4,6,9,11
		boolean month28Days = month == 2;
		boolean month30Days = month == 4 || month == 6 || month == 9 || month == 11;
		// boolean month31Days = !month28Days && !month30Days;

		if (month >= 1 && month <= 12) {

			if (month28Days) {
				System.out.println(28 + " days");
			} else if (month30Days) {
				System.out.println("30 days");
			} else {
				System.out.println("31 days");
			}

		} else {
			System.out.println("Invalid Number");
		}

		System.out.println("*******");
		
		
		int day = 1;
		String name = "";
		
		if(day >=1 && day <=7) {
			
			if(day==1) {
				name = "Monday";
			}else if(day == 2) {
				name = "Tuesday";
			}else if(day ==3){
				name = "Wednesday";
			}else if(day ==4) {
				name = "Thursday";
			}else if(day == 5) {
				name = "Friday";
			}else if(day == 6) {
				name = "Sdaturday";
			}else {
				name = "Sunday";
			}
			
		}else {
			name = "Invalid Day";
		}
		
		System.out.println(name);
		
		
		
		
		
		
		

	}

}
