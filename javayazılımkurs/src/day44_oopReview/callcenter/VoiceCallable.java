package day44_oopReview.callcenter;

public interface VoiceCallable {
	
	
	boolean CAN_CALL = true;		//  public static final
	
	void call (String contact);		//  public abstract
	
	
	public  static void decline() {	//  static method
		
		System.out.println("Mike declined voice call...");
	}
	
	public default void accept() {	//  default method
		
		System.out.println("Mike finally accepted voice call...");
	}
	
	

}
