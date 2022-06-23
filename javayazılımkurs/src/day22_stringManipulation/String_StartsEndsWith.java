package day22_stringManipulation;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		System.out.println("*******");
		
		
		/*
		 Mr. => married man
		 Mrs.=> married woman
		 Ms. => Some woman
		 Dr. => Doctor man or woman
		 No title => Unknown status
		 */
		
		String a = "Dr. Abcd";
		
		if (a.startsWith("Mr.")) {
			System.out.println("Married man");
		}else if (a.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if (a.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if (a.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown Status");
		}
		
		
		
		
		
		
		
		

	}

}
