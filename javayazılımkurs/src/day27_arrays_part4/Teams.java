package day27_arrays_part4;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {
		
		String[][] teams = new String[2][4];
		
		teams[0][0] = "Mike";
		teams[0][1] = "Tony";		
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";		
		teams[1][1] = "Emmy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		
		System.out.println("Number of rows: " + teams.length);
		System.out.println("# People in first team: " + teams[0].length);
		System.out.println("# People in second team: " + teams[1].length);
		
		System.out.println(Arrays.toString(teams[0]));
		System.out.println(Arrays.toString(teams[1]));
		
		//String[][] teams1 = { {"Mike", "Tony", "Smith", "Evan"}, {"David", "Emmy", "John", "Ryan"} };
		
		String[][] teams1 = 
			{
				{"Mike", "Tony", "Smith", "Evan"}, // row0
				{"David", "Emmy", "John", "Ryan"}  // row1
			};
		
		
		
		
		
		
		
		
		

	}

}
