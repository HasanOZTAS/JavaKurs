package Exercises;

public class task65 {

	public static void main(String[] args) {
		
		averageGrade(25,92,71);

	}
	
	public static void averageGrade(int a, int b, int c) {
		double avrg=(a+b+c)/3;
		if (avrg>=0 && avrg<=100) {
			if(avrg>=90 && avrg<=100) {
				System.out.println(avrg +" A");
			}else if (avrg>=80 && avrg<=89) {
				System.out.println(avrg+" B");
			}else if (avrg>=70 && avrg<=79) {
				System.out.println(avrg + " C");
			}else if (avrg>=60 && avrg<=69) {
				System.out.println(avrg + " D");
			}else {
				System.out.println(avrg + " F");
			}
		}else {
			System.out.println("Invalid number");
		}
		
	}

}
