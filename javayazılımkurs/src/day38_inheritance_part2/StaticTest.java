package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10;
		obj.print();
		System.out.println(StaticSub.num);
		
		StaticSuper.m1(); //  can be called either Parent's or Child's classname.
		StaticSub.m1();  //  Static method. Can be called both ClassName.methodname or through object.
		obj.m1();        //  Same with above.
		// StaticSub.m2();  //  Not static. Instance. Can be called through object like below.
		obj.m2();
		
		
		
		

	}

}
