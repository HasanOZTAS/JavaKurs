package day30_wrapperClass;

import java.util.Arrays;

public class task96_ConvertingTemp {

	public static void main(String[] args) {
		
		// Write a program to output: 72 degree is equal to 22.22 celcius
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr = str1.split("and ");
		arr = arr[1].split(" degree");
		System.out.println(Arrays.toString(arr));
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		
		double degreeC = (degreeF-32) * 5/9;
		
		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");
		
		
		
		
		
		

	}

}
