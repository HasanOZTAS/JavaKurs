package day13_methods_Part1;

public class task59_PayCalculator {

	public static void main(String[] args) {
		
		payCalculator(80,20.5);		
		payCalculator(65,22.5);

	}

	public static void payCalculator(double hours, double hourlyPay) {
		double pay=hours*hourlyPay;
		System.out.println("The Pay is " + pay);
		
		
	}

}
