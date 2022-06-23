package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,5,1,1,1,2,2,3,2,1,1,1));
		
		/*
		for (int i=0; i< list.size(); i++) {
			
			if (list.get(i)<3) {
				list.remove(i);
			}
		}  We have to apply Iterable to remove objects from collection during the iteration.
		*/
		
		//list.removeIf(each -> each < 3);
		list.removeAll(Arrays.asList(1, 4));
		
		System.out.println(list);
		
		System.out.println("*******");
		
		// remove the country names that length is longer than 10
		String[] countryNames = {"Turkiye", "United States Of America", "United Kingdom", "Japan", "Korea", "Russia"};
		ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));
		
		System.out.println(countries);
		
		countries.removeIf( p -> p.length() > 10);
		
		System.out.println(countries);
		
		System.out.println("*******");
		
		// Remove all the job titles except for SDET and QA
		String[] jobTitles = { "SDET", "SDET", "QA", "QA", "QE", "BA", "PO", "SM", "PO","Data Analyst", "DEV"};
		ArrayList<String> jobList = new ArrayList<>(Arrays.asList(jobTitles));
		//jobList.retainAll(Arrays.asList("SDET", "QA"));	//  Removes job titles except for SDET and QA
		//jobList.removeAll(Arrays.asList("SDET", "QA")); //  Removes job titles SDET and QA
		jobList.removeIf(job -> !(job.equals("SDET") || job.equals("QA")));
		
		System.out.println(jobList);
		
		
		
		

	}

}
