package day10_controlFlowStatements_Part4;

public class task44_SpeedConverter {

	public static void main(String[] args) {
		
		System.out.println(" KPH         MPH");
		System.out.println("----------------");
		
		for (int i = 60; i<=150; i+=10) {
			System.out.println(i + "   \t    " + (i*0.6214) );
		}
		
		
		

	}

}
