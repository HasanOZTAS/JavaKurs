package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);	
		
		System.out.println();
		System.out.println("*******");
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		System.out.println("*******");
		
		ArrayList<Integer> list = getList(25);
		System.out.println(list.toString());
		
		System.out.println("*******");
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		System.out.println("*******");
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");		
		System.out.println(strnums);
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);		

	}


	public static void printList(ArrayList<Integer> nums) {
		
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		
		
	}
	
	public static double sumList (ArrayList<Double> dlist) {
		
		double sum=0;
		for (Double n : dlist) {
			sum = sum + n;
		}
		return sum;			
	}	

	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (int i=1; i<=size; i++) {
			newList.add(i);
		}
		return newList;
	}
	
	public static ArrayList<Integer> getRandomList (int size) {
		
		Random rn = new Random();
		ArrayList<Integer> newArr = new ArrayList<>();
		
		for (int i =0; i<size; i++) {
			// newArr.add(rn.nextInt(101);
			int num = rn.nextInt(101);  
			newArr.add(num);				
		}
		
		return newArr;		
	}
	
	public static ArrayList<Integer> convertToIntList (ArrayList<String> strList) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (int i=0; i<strList.size(); i++) {
			newList.add(Integer.parseInt(strList.get(i)));
		}
		
		/*
		for(String str : strList) {
			
			newList.add(Integer.parseInt(str));
		}
		*/
		
		return newList;
	}
	

}
