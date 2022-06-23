package day06_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {
		
		int ApplesCount = 20;
		int OrangesCount= 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		System.out.println(comp);
		
		System.out.println();
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shiny";
		Degree = 70;
		
		boolean comp2 = ( !(OutsideWeather == "Rainy" || Degree==70));
		System.out.println(comp2);
		
		System.out.println();
		
		int b =2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;   //  f || t && f
			//		   3  == 2 ||  2  == 2 && --1 == 2;	
		    //             F   ||      T   &&      F
		    //             F   ||          F
		    //                  F
		System.out.println(res);
		
		
		System.out.println();
		
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10 ) || (z = false);  // T || ----
		
		System.out.println(x);
		
		System.out.println();
		
		
		
		
		
		
		
		

	}

}
