package lab3;

public class Question13 {

	public static void main(String[] args) {
		
		String str = "Hasan";
		
		String newstr = "";
		
		for (int i=0; i<str.length(); i++) {
			
			newstr = newstr + str.substring(i,i+1).concat(str.substring(i, i+1));
			
		}
		System.out.println(newstr);
		

	}

}
