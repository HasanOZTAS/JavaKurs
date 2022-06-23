package day13_methods_Part1;

public class DeepAndDeeper {

	public static void main(String[] args) {
		System.out.println("I am starting in main");  // 1
		deep();										  // 2
		System.out.println("Now I am back in main");  // 7

	}
	
	public static void deep() {
		System.out.println("I am now in deep");			// 3
		deeper();										// 4
		System.out.println("Now I am back in deep");	// 6
	}
	public static void deeper() {
		System.out.println("I am now in deeper");		// 5
	}

}
