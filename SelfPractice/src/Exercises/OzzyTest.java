package Exercises;

public class OzzyTest {

	public static void main(String[] args) {
		
		/*
		int one = 1;
		String two = "2";
		
		System.out.println(two + 1 + one);
		System.out.println(one + 1 + two);
		*/
		
			System.out.println("*******");
		
		/*
		 String string1 = "Java Exercises";
		 String string2 = "do more " + string1;
		 String string3 = string2;
		 
		 System.out.println("To able to be successful, we need to " + string3) ;
		 */
			
		 	System.out.println("*******");
		 
		 	/*
		 System.out.println(3 * (4+4*4) / 2 - 6);
		 */
		 	
		 	System.out.println("*******");
		 
		 	/*
		 int grade=55;
		 
		 if (grade>40) {
			 System.out.println("Congratulations");
			 if (grade<60 || grade==60) {
				 System.out.println("You passed");				 
			 }
		 }else {
			 System.out.println("You failed");
		 }
		 
		 */
		 	System.out.println("*******");
		 
		 /*
		 int x=4;
		 int y=x * 4-x++;
		 
		 if (y<10) {
			 System.out.println("Too low");
		 }else if (y>10 && y<=15) {
			 System.out.println("Just Right");
		 }else {
			 System.out.println("Too high");
		 }
		 */
		 	
		 	System.out.println("*******");
		 
		 /*
		 int x1=50, x2=75;
		 boolean b=x1>=x2;
		 
		 if (b=true) {			// = Assignment not == boolean
			 System.out.println("Success");
		 }else {
			 System.out.println("Failure");
		 }
		 
		 */
		 	
		 	System.out.println("*******");
		 
		 
		 /* 
		 if (true) {
		 if (false) {
			 System.out.println("A");
		 }else {
			 System.out.println("B");
		 }
		 }
		 
		 */
		 	
		 	System.out.println("*******");
		 
		 /*
		 int temperature=50;
		 int upperLimit=70;
		 int lowerLimit=30;
		 
		 if (temperature >= upperLimit) {
			 System.out.println("Sound Alarm");
			 System.out.println("Turn Heater Off");
		 }else if (temperature < lowerLimit) {
			 System.out.println("Sound Alarm");
			 System.out.println("Turn Heater On");
		 }else if ( temperature == (upperLimit - lowerLimit) / 2) {
			 System.out.println("Doing Fine");
		 }else {
			 System.out.println("No Cause to Worry");
		 }
		 
		 */
		 		System.out.println("*******");
		 	
		 /*
		 int i, c;
		 double d, f;
		 
		 i=4;
		 f=4.3;
		 d=1.8;
		 c=0;
		 
		 if (i != c) {		// i=c  error
			 c++;
			 if ((f+d) == (c+=2)) {		// c=c+2
				 System.out.println(c);
			 }
		 }
		 System.out.println(c);
		 
		 */
		 
		 		System.out.println("*******");
		 
		 /*
		 boolean flag=false;
		 
		 if (false) {		// Prints nothing
			 flag =!flag;
			 System.out.println(flag);
		 }
		 		
		 */
		 		
		 			System.out.println("*******");
		 			
		 			
		 /*
		  	
		  	Which ones true
		  	(!true)
		  	(false || true)  <--
		  	(4 <= 4)		 <--
		  	(true && false)
		 
		 	*/
		 	
		 			System.out.println("*******");
		 			
		 	/*
		 	int i=0, j=0;
		 	boolean t=true, r;
		 	
		 	r = ( t && 0 < (i+=1) );
		 	r = ( t && 0 < (i+=2) );
		 	r = ( t || 0 < (j+=1) );  // Because the short circuit || second side
		 	r = ( t || 0 < (j+=2) );  // is not important, is not checked.
		 	
		 	System.out.println( i + " " + j );
		 	
		 	*/
		 			
		 			System.out.println("*******");
		 	
		 	
		 	/*
		 	int x = 7, m = 10;
		 	++m;
		 	
		 	x = x-- + m--;
		 	
		 	System.out.println(x + " " + m);
		 	
		 	*/
		 			
		 			System.out.println("*******");
		 			
		 	
		 	/*
		 	int temp = 65;
		 	int roomTemp = 72;
		 	int carTemp = 75;
		 	
		 	System.out.println( temp >=65 && ( ( roomTemp == ( temp+=2)) && ( carTemp != temp )));
		 
		 */
		 			
		 			System.out.println("*******");
		 			
		 	
		 	/*		
		 	int a = 1 + 2 + 3 * 4;
		 	int b = 2 * 3 + 4;
		 	int total = a+b;
		 	
		 	System.out.println(total);
		 	
		 	*/
		 			
		 			System.out.println("*******");
		 			
		 			
		 	/*		
		 	boolean b1=false;
		 	boolean b2=false;
		 	
		 	if ( (b2=b1) == false) {
		 		System.out.println("true");
		 	}else {
		 		System.out.println("false");
		 	}
		 	
		 	*/
		 			
		 				 			
		 			System.out.println("*******");
		 	
		 	/*
		 	int x1=50, x2=75;
		 	boolean b=x1>=x2;
		 	
		 	if (b=true) {
		 		System.out.println("Success");
		 	}else {
		 		System.out.println("Failure");
		 	}
		 			
		 	*/
		 	
		 			
		 				System.out.println("*******");
		 				
		 				
		 	/*			
		 	int num=1234;
		 	
		 	if (num<100 && num>=1) {
		 		System.out.println("It's a two digit number");
		 	}else if (num<1000 && num>=100) {
		 		System.out.println("It's a three digit number");
		 	}else if (num<10000 && num >=1000) {
		 		System.out.println("It's a four digit number");
		 	}else if ( num<100000 && num>= 10000) {
		 		System.out.println("It's a five digit number");
		 	}else {
		 		System.out.println("Number is not between 1 & 99999");
		 	}
		 				
		 	*/
		 				
		 				
		 				System.out.println("*******");
		 	
		 				
		 	/*			
		 	int var1=12;
		 	int var2=21;
		 	
		 	if (var1 != var2) {
		 		System.out.println("var1 is not equal to var2");
		 		if(var1>var2) {
		 			System.out.println("var1 is greater than var2");
		 		}else {
		 			System.out.println("var2 is greater than var1");
		 		}
		 	}else {
		 		System.out.println("var1 is equal to var2");
		 	}
		 	
		 	*/
		 
		 				System.out.println("*******");
		 
		 	/*			
		 	int monthNumber=11;
		 	
		 	switch (monthNumber) {
		 	case 12: case 1: case 2:
		 		System.out.println("Snow in the winter");
		 		break;
		 	case 3: case 4 : case 5:
		 		System.out.println("Green grass in the spring");
		 		break;
		 	case 6: case 7: case 8:
		 		System.out.println("Sunshine in the summer");
		 		break;
		 	case 9: case 10: case 11:
		 		switch (monthNumber) {
		 		case 10:
		 			System.out.println("Halloween");
		 			break;
		 		case 11:
		 			System.out.println("Thanksgiving");
		 			break;
		 		}
		 		System.out.println("Yellow leaves in the fall");
		 		break;
		 	default:
		 		System.out.println(monthNumber + " is not a valid month");
		 	}
		 		
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 	
		 	/*			
		 	char c='c';
		 	
		 	switch(c) {
		 	case 'a':
		 		System.out.println("Apple");
		 	case 'b':
		 		System.out.println("Bat");
		 		break;
		 	case 'c':
		 		System.out.println("Cat");  //  Without 'brake' Cat None
		 	default:
		 			System.out.println("None");
		 	
		 	}
		 				
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 				
		 	/*			
		 	int x = (2+4*9/3)%5;
		 	
		 	switch (x) {
		 	case 0:
		 		System.out.println("Hello");
		 	default:
		 		System.out.println("World");
		 	case 1:
		 		System.out.println("Good Bye");
		 		break;
		 	case 2:
		 		System.out.println("Bye");
		 	}
		 				
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 	/*			
		 	int i=5, f=6, d=3, c=1;
		 	
		 	if (i !=f) {
		 		c++;
		 	}
		 	
		 	if ( (f+d) == (c+=2)) {
		 		c--;
		 	}
		 	System.out.println(c);
		 				
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 				
		 	/*			
		 	boolean b1=false;
		 	boolean b2=false;
		 	
		 	if ( b2 != ( b1 = !b2 )) {
		 		System.out.println("True");
		 	}else {
		 		System.out.println("False");
		 	}
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 	/*			
		 	boolean X = true;
		 	boolean Y = !X==false;
		 	boolean Z = Y;
		 	
		 	if (X) {
		 		System.out.println("Hello Everyone");
		 	} if ( Y ) {
		 		System.out.println("Today is great day");
		 	} if ( Z ) {
		 		System.out.println("We have picnic on Saturday");
		 	}
		 				
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 	/*	
		 	char grade= 'A';
		 	boolean Passed = grade == 'A' || grade == 'B';
		 	boolean Passed2= grade == 'C' || grade == 'D';
		 	
		 	if ( Passed || Passed2) {
		 		System.out.println("You've passed the exam");
		 	} else {
		 		System.out.println("You have failed");
		 	}
		 	*/
		 				
		 				System.out.println("*******");
		 				
		 				
		 	/*			
		 	switch (condition) {
		 	case 1:
		 		System.out.println("1"); break;
		 	case 2:
		 		System.out.println("2"); break;
		 	case 3:
		 		System.out.println("3"); break;
		 	}
		 	
		 	*/			
		 				
		 				System.out.println("*******");
		 				
		 	/*			
		 	
		 	what can be the result
		 	
		 	if (flag) {
		 		if (flag) {
		 			System.out.println("True False");
		 		}else {
		 			System.out.println("True True");
		 		}
		 	}else {
		 		System.out.println("False False");
		 	}
		 				
		 	*/			
		 				
		 
		 
		 
		 
		 
		 

	}

}
