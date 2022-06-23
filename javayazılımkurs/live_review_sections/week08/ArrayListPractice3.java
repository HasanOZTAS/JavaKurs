package week08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

	public static void main(String[] args) {
		
		// {10, 20, 10, 20, 10, 20, 10, 20}
		
		int[] numbers = {10, 20, 10, 20, 10, 20, 10, 20};  // remove duplicates.
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for (int each : numbers) {
			/*
			if (list.contains(each)) {
				continue;
			}
			list.add(each);
		
		*/  // or 
		
			if (!list.contains(each)) {
			list.add(each);
			
			}
		}
		System.out.println(list);
		
		System.out.println("*******");
		
		ArrayList<String> names = new ArrayList<>();
		
		//  names.addAll("Ali", "Veli", "Ahmet");  ---error
		
		names.addAll(Arrays.asList("Ali", "Veli", "Ahmet"));
		
		names.set(1,"Mehmet");
		names.add(0, "Hasan");
		
		System.out.println(names);
		System.out.println(names.get(1));
		
		
		
		
		

	}

}
