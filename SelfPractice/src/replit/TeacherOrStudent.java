package replit;

import java.util.Scanner;

public class TeacherOrStudent {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	String name = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	if (name.equals("Chen")) {
	        System.out.println("teacher");
	      }
	      if (!name.equals("Chen")){
	        System.out.println("student");
	      }    

	}

}
