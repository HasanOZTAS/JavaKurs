package Test3;

public class Test4 {

	public static void main(String[] args) {
		
		/*
		String s = "JavaScript String Quiz";
		System.out.println(s.charAt(s.length()-6));
				
		System.out.println(s.substring(3, 5));
		*/
		
		/*
		String s = "JavaScript" + 1 + 2 + "Quiz" + "" + (3+4);
		System.out.println(s);
		*/
		
		/*
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
		*/
		
		/*
		String s = "purr";
		s.toUpperCase();
		s.trim();
		s.substring(1, 3);
		s+= " two";
		
		System.out.println(s.length());
		*/
		
		/*
		int total = 0;
		String letters = "abcdesfg";
		
		total+=letters.substring(1, 2).length();
		total+=letters.substring(6, 6).length();
		total+=letters.substring(5, 6).length();
		
		System.out.println(total);
		*/
		
		/*
		String b = "rumble";
		
		b+=b.concat("4").substring(3, b.length()-1);
		
		System.out.println(b);
		*/
		
		/*
		System.out.println("|" + FunCharSeq(" W ").concat("W") + "|");
		*/
		
		/*
		String str = "restructure";
		System.out.println(str.substring(2, 3));
		*/
		
		/*
		String space = " ";
		String comp = space + "hello" + space + space;
		comp.concat("world");
		String trimmed = comp.trim();
		System.out.println(trimmed.length());
		*/
		
		
		/*
		String str = "JavaScript";
		System.out.println(getMsg(str));
		*/
		
		/*
		String str = "Cybertek Students";
		int x = str.indexOf("t", 8);
		System.out.println(str.substring(3, x));
		*/
		/*
		String str = "";
		int k = m1(str.length());
		k+=3 + ++k;
		System.out.println(k);
		*/
		
		/*
		String s = "minimum";
		
		System.out.println(s.substring(4, 7));
		*/
		
		String str = "01234567";
		System.out.println(str.substring(4, 7));

	}
	
	public static int m1(int i) {
		return ++i;
	}
	
	public static String FunCharSeq(String str) {
		
		str = str.trim();
		str+="0";
		return str;
	}
	
	public static String getMsg (String x) {
		
		String msg = "Input value must be ";
		msg = msg.concat("smaller than x");
		msg.replace("X", x);
		String rest = " and larger than 0";
		
		return msg;
		
	}

}
