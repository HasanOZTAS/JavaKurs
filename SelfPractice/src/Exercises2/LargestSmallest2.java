package Exercises2;

import java.util.Scanner;

public class LargestSmallest2 {
	
	static int largest, smallest;
    static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		 int number1 = getFirstNumberFromTheUser();
	        int number2 = getNextNumberFromTheUser();
	        compareTheNumbers(number1, number2);

	        while(userWantToEnterAnotherNumber()){
	            int nextNumber = getNextNumberFromTheUser();
	            compareTheNumbers(nextNumber);
	        }

	        printResult();

	}
	
	 public static boolean userWantToEnterAnotherNumber() {
	        System.out.print("Do you want to enter another number? 0-No 1-Yes: ");
	        int choice = input.nextInt();
	        if(choice==1){
	            return true;
	        }else if(choice==0){
	            return false;
	        }else{
	            return userWantToEnterAnotherNumber();
	        }
	    }

	    public static int getFirstNumberFromTheUser(){
	        System.out.print("Please enter first number: ");
	        return input.nextInt();
	    }

	    public static int getNextNumberFromTheUser(){
	        System.out.print("Please enter next number: ");
	        return input.nextInt();
	    }

	    public static void compareTheNumbers(int number1, int number2){
	        if (number1>number2){
	            largest = number1;
	            smallest = number2;
	        }else {
	            largest = number2;
	            smallest = number1;
	        }
	    }

	    public static void compareTheNumbers(int nextNumber){
	        if (nextNumber>largest){
	            largest = nextNumber;
	        }
	        if (nextNumber<smallest){
	            smallest = nextNumber;
	        }
	    }

	    public static void printResult(){
	        System.out.println("Largest number: " + largest);
	        System.out.println("Smallest number: " + smallest);
	    }

	}	


