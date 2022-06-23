package day27_arrays_part4;

public class Task95_ScoreCalc {

	public static void main(String[] args) {
		
		int[][] scores = {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90 },
		};
		
		int sumS1=0;
		
		for (int i=0; i<scores[0].length; i++) {
			sumS1 += scores[0][i];
		}
		System.out.println(sumS1/scores[0].length);
		
		int sumMath=0;
		
		for (int i=0; i<scores.length; i++) {
			sumMath += scores[i][0];
		}
		System.out.println(sumMath);
		
		
		

	}

}
