package day40_accessmodifiers_final_hiding;

public class FinalVariables {
	
	//  Three ways of assigning value with final keyword
	//  instance variables
	
	public final int ROADSTER_MAX_RANGE = 600;  //  1 --  in the same statement
	public final int MODEL_3_MAXSPEED;			//  2 --  in constructor
	public final int MODEL_X_PASSENGERS;		//  3 --  in init block
	public static final String ADMIN_USERNAME;	//  4 --  final static variables must be assigned 
	
	public FinalVariables() {  		
		
		MODEL_3_MAXSPEED = 200;		//  2  --  in this constructor
		//ADMIN_USERNAME = "MIKE";	//  4  --  in constructor error
	}
	
	
	{								
		MODEL_X_PASSENGERS = 7;		//  3  --  in init block
		//ADMIN_USERNAME = "MIKE";	//  4  --  in init block error
	}
	
	
	static {
		ADMIN_USERNAME = "MIKE";	//  4  --  in static block
	}
	

	public static void main(String[] args) {
		
		// Local variables
		
		final int MAX_PASSENGERS_COUNT = 5;
		
		final int SSN;		//  final local variables can be assigned later 
							//  local variables cannot have Access Modifiers
		SSN = 99;
		// SSN++;			//  error
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);					// ADMIN_USERNAME is in the same class
		

	}

}
