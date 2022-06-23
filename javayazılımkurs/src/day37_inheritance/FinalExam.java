package day37_inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	
	public FinalExam (int numQestions, int numMissed) {
		
		double numericScore;
		
		this.numQuestions = numQestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQestions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		// score = numericScore;  // score is private.  error.
		setScore(numericScore);	
		
	}
	
	

}
