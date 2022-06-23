package lab3;

public class Question17 {

	public static void main(String[] args) {
		
		String str = "top sp ot";
		
		String str1 = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			str1 = str1 + str.substring(i, i+1);
						
		}
		System.out.println(str1);
		
		if(str1.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
