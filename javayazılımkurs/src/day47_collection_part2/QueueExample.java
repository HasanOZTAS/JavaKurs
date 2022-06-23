package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		
		Queue<String> queue = new LinkedList<>();
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asya");
		
		System.out.println(queue.toString());
		System.out.println(queue);
		
		String name = queue.remove();
		System.out.println(name);
		
		System.out.println(queue);
		
		// removing an element from Queue using poll()
		// the poll() method is similar to remove() except it returns null if queue is empty
		name = queue.poll();
		System.out.println(name);
		
		System.out.println(queue);
		
		// get the element at the front of the queue without removing it using peek()
		name = queue.peek();
		System.out.println(name);
		System.out.println(queue);
				

	}

}
