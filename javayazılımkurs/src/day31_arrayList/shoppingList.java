package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		// print numbers of item
		System.out.println(shoppingList.size());  // numbers of items
		
		// print all items
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList);
		
		// print first and last items
		System.out.println(shoppingList.get(0) + ", " + shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		// print each item
		for (String item : shoppingList) {
			System.out.println(item);
		}
		
		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		

	}

}
