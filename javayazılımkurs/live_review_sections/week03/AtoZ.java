package week03;

public class AtoZ {

	public static void main(String[] args) {
		
		for (char i='A';i<='Z';) {
	          char  alphabet = i;
	            System.out.print(alphabet + " ");
	            ++i;
		}
		System.out.println();
		System.out.println("*******");
		
		for (char i='a';i<='z';i++) {
            System.out.print(i+ " ");
		}		
	}

}
