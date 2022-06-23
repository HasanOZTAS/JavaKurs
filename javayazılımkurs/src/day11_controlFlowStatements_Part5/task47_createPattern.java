package day11_controlFlowStatements_Part5;

public class task47_createPattern {

	public static void main(String[] args) {
		
		/*
		for ( int i =1; i<=7; i++) {
			System.out.print("***");
			for ( int a=1; a<=1; a++) {
				System.out.println("***");
			}				
		}
		*/
		
		
		int rows=7;
		int columns=6;
		
		for (int i=1; i<=rows; i++) {
			
			for ( int j=1; j<=columns; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		for (int i=1; i<=rows; i++) {
			System.out.println();
			for ( int j=1; j<=columns; j++) {
				System.out.print("* ");
			}
			
		}
		
		System.out.println();
		System.out.println("-------");
		System.out.println();
		
		
		for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < k; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
		
		
		System.out.println();
		System.out.println("-------");
		
		
		int row=15;
        int space =0;
        
        for (int i = 1; i <= row; i++) {

            for (space = (row-i)-2; space >=0 ;space --) {
                System.out.print(" ");

            }
            inner:
            for (int j = 1; j <= i; j++) {
                if(i%2==0) {
                    break inner;
                }
                System.out.print("* ");
            }

            System.out.println();}
		
		
		

	}

}
