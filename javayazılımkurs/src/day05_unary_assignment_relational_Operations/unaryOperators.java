package day05_unary_assignment_relational_Operations;

public class unaryOperators {

	public static void main(String[] args) {
		
		int a = 25;
		System.out.println(++a);
		System.out.println(--a);
		
		System.out.println();
		
		int b = 25;
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println();
		
		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2);
		int i4= -(10+-100);
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println(i4);
		
		
		System.out.println();
		
		boolean flag = true;
		System.out.println(!flag);  //  = not true    // makes opposite
		System.out.println(!!flag); //  =not (not true)
		
		System.out.println();
		
		int i =10, j=5;
		i++;  //same as i = i + 1
		--j;  //same as j = j - 1
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		System.out.println();
		
		int res = i++ + --j;
		System.out.println("res = " + res);
		
		
		
		
		
		
		
		
		
		
		

	}

}
