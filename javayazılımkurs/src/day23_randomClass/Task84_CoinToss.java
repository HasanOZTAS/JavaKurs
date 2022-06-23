package day23_randomClass;

import java.util.Random;
import java.util.Scanner;

public class Task84_CoinToss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		
		for (int i=0; i<10; i++) {
			
			if (rn.nextInt(2) == 0) {
				System.out.println("Tails");
			}else {
				System.out.println("Heads");
			}
			
		}
		
		
		

	}

}
