package day44_oopReview.callcenter;

public class CallCenter {

	public static void main(String[] args) {
		
		
		
		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "Whats App";
		wa.call("Hasan");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println();
		
		VoiceCallable obj = new WhatsApp();
		((MessagingApp)obj).launch();
		((WhatsApp)obj).launch();
		
		((MessagingApp)obj).allOSCompatible = false;
		
		obj.call("Mr. Tom");
		
		((WhatsApp)obj).videoCall();
		
		((VideoCallable)obj).videoCall();
		
		
		
		
		

	}

}
