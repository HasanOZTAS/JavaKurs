package day42_interface;

public  interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false;  //  public final static even if not defined.
	
	public abstract void charge();	
	
	void charge2(); //  always public abstract
	
	public default void methodA() {
		
		// code
	}
	
	public static void methodB() {
		
		// code
	}
	
	
	

}
