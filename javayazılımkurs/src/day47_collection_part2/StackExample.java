package day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		
		Stack<Integer> numsStack = new Stack<>();
		//Vector<Integer> numsStack = new Stack<>();	// polymorphism
		
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(50);
		
		System.out.println(numsStack.toString());
		
		// check value on top of stack
		System.out.println(numsStack.peek());
		//System.out.println(((Stack)numsStack).peek());	// casting
		
		//read value on top of stack then remove it
		System.out.println(numsStack.pop());
		//System.out.println(((Stack)numsStack).pop());		// casting
		System.out.println(numsStack.toString());
		
		System.out.println(numsStack.peek());
		//System.out.println(((Stack)numsStack).peek());	// casting
		
		System.out.println(numsStack.get(0));
		System.out.println(numsStack);
		

	}

}
