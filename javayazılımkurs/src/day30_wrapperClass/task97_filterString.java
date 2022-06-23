package day30_wrapperClass;

public class task97_filterString {

	public static void main(String[] args) {
		
		// Write a method that returns : Welcome to core Java
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";		
		
		System.out.println(filterString(str));

	}
	
	public static String filterString (String text) {
		
		String newText = "";
		for (int i=0; i<text.length(); i++) {
			if (Character.isAlphabetic(text.charAt(i)) || text.charAt(i) == ' ') {
				newText += text.charAt(i);
			}
		}
		return newText;
	}

}
