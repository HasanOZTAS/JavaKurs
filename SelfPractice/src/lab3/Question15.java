package lab3;

public class Question15 {

	public static void main(String[] args) {
		
		String str = "xbadxx";
		
		boolean flag = true;
		
		for (int i=0; i<2; i++) {
			
			if (str.substring(i, i+3).equals("bad")) {
				flag =true;
				break;
			}else {
				flag=false;				
			}
		}
		if (flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}

}
