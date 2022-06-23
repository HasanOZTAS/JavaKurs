package week03;

public class BranchingStatements {

	public static void main(String[] args) {
		
		
		
		System.out.println("*******");
		
		
		for(int i=10; i<=100; i+=10) {
			if(i==50 || i==70) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("*******");
		
		
		int j=0;
		
		while(j<=20) {
			j++;
			if(j%3==0) {			
				continue;
			}
			System.out.print(j + " ");			
		}
		
		
		System.out.println("*******");
		
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+ " ");
		}
		

	}

}
