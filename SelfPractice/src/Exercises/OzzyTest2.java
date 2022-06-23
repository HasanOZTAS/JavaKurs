package Exercises;

public class OzzyTest2 {

	public static void main(String[] args) {
		
		
		for(int i=0; i>-3; i--) {
			System.out.println("Hello");
		}
		
		
		
		
		/*
		int i;
		for( i=0; i<=2;i++) {}
		System.out.println(i);
		*/
		
		System.out.println("*******");
		
		/*
		for (int i =0; i<10;i++) {
			i++;				// increases 1 more
			System.out.println(i);
		}
		*/
		
		System.out.println("*******");
		
		/*
		int i=0;
		int j;
		for (j=0; j<10; ++j) {i++;}
		System.out.println(i+ " " +j);
		
		*/
		
		
		System.out.println("*******");
		
		/*
		int k=0;
		int m=0;
		
		for (int i=0; i<=3;i++) {
			k++;
			if (i==2) {
				i=4;
			}
			m++;
		}
		System.out.println(k+ "," + m);
		*/
		
		
		System.out.println("*******");
		
		/*
		int sum=0;
		for (int i=0, j=0; sum>20; ++i, --j) {  // Condition sum>20  is false !!!
			sum=sum+i+j;
		}
		System.out.println("Sum = " + sum);
		*/
		
		System.out.println("*******");
		
		/*
		int sum=0;
		for (int i=0; i<10; i++) {
			if (i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum = " +sum);
		*/
		
		System.out.println("*******");
		
		/*
		int x=5;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		*/
		
		System.out.println("*******");
		
		
		/*
		do {
			System.out.println("100");  //  infinite loop
		}while(true);
		System.out.println("Bye");    //  Unreachable code
		*/
		
		System.out.println("*******");
		
		/*
		int start=1;
		int sum=0;
		
		do {
			if (start%2==0) {
				start++;
			}
			sum+=start;
		}while (++start<=10);
		System.out.println(sum);
		*/
		
		System.out.println("*******");
		
		/*
		int x=3;
		int i=0;
		while (i<3) {
			x+=1;
			i+=1;
		}
		System.out.println(x);
		*/
		
		System.out.println("*******");
		
		
		/*
		int i=0;
		while (i<3) {
			System.out.println("hi");
			i++;
		}
		System.out.println("bye");
		*/
		
		
		System.out.println("*******");
		
		
		/*
		int i=3;
		while(i<6) {
			System.out.println(i);
			i+=1;
		}
		*/
		
		System.out.println("*******");
		
		/*
		do {
			System.out.println("100");
		}while (false);
		System.out.println("Bye");
		*/
		
		System.out.println("*******");
		
		
		/*
		int x=20;
		
		while (x>0) {
			do {
				x-=2;
			}while(x>5);
		}
		x--;
		System.out.println(x);
		*/
		
		System.out.println("*******");
		
		/*
		int x=0;
		while (x++<10) { }
		if (x>10) {
			System.out.println("Greater than" + "," + x);
		}else {
			System.out.println("Not Greater than" + "," + x);
		}
		*/
		
		System.out.println("*******");
		
		/*
		int x=1, y=15;
		
		while (x<10) {
			y--;
			x++;
		}
		System.out.println(x + ", " + y);
		*/
		
		System.out.println("*******");
		
		/*
		int i1=1, i2=2, i3=4; i2=i3%3;
		int i4= i1+ (i2*i3) + i3;
		System.out.println(i4);
		*/
		
		System.out.println("*******");
		
		/*
		int c=0;
		boolean flag=true;
		
		for (int i=0; i<8; i++) {
			while (flag) {
				c++;
				if (i>c || c>3) {
					flag=false;
				}
			}
		}
		System.out.println((c));
		*/
		
		System.out.println("*******");
		
		/*
		label1: for (int i=0; i<10; i++) {
			for ( int j=0; j<10; j++) {
				if (i+j-1>10) {
					break label1;
				}
			}
			System.out.println("Hello");
		}
		*/
		
		System.out.println("*******");
		
		/*
		int k=2;
		do {
			System.out.println(k);
		}while (k-->0);
		*/
		
		System.out.println("*******");
		
		
		/*
		int counter=4;
		
		outer:
			for ( int i=0 ;i<4; i++) {
				middle:
					for  ( int j=0; j<4; j++) {
						inner:
							for(int k=0; k<4; k++) {
								if (k-j>0) {
									break middle;
								}
								counter++;
							}
					}
			}
		System.out.println(counter);
		*/
		
		System.out.println("*******");
		
		/*
		boolean b=false;
		int i=1;
		do {
			i++;
		}while (b=!b);
		System.out.println(i);
		*/
		
		
		System.out.println("*******");
		
		/*
		int Value=1;
		
		switch ( Value) {
			case Value:
				System.out.println("One");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		*/
		
		System.out.println("*******");
		
		
		/*
		long z=10;
		
		switch (z) {		// z must be int, byte, short, char, string
		case 10:
			System.out.println("Monday");
		case 11:
			System.out.println("Tuesday");
		case 12:
		System.out.println("Wednesday");
		default:
			System.out.println("Friday");		
		}
		*/
		
		System.out.println("*******");
		
		/*
		boolean opt=true;  //  error   change with
							// 1-String opt="true"
		switch(opt) {		// error   change with
		case true:			// 2-case "true"
			System.out.println("True");
			break;
			default:
				System.out.println("False");
		}
		System.out.println("Done");
		*/
		
		System.out.println("*******");
		
		/*
		int amount=10;
		String result = amount <= 2 ? "couple" : amount >2 && amount <5 ? "few" : 
			amount <= 5 ? "several" : "many" ;
		System.out.println(result);
		*/
		
		System.out.println("*******");
		
		
		/*
		int x=0;
		
		while (x++<10) {
			String message = x>10 ? "Greater than" : false;  // error --- here false is boolean !!!
			System.out.println(message + ", " + x);			 //  can not be assign to String
		}
		*/
		
		
		
	}

}
