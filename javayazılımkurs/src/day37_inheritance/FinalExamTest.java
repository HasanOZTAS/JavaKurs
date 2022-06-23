package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are there in the exam");
		questions = scn.nextInt();
		
		System.out.println("How many questions did the student miss?");
		missed = scn.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		System.out.println("The grade for the exam is: " + exam.getGrade());
		
		
		

	}

}
