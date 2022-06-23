package day44_oopReview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable {

	@Override
	public void videoCall() {
		
		System.out.println("WhatsApp _ doing a video call Mr Mike...");
	}

	@Override
	public void call(String contact) {
		
		System.out.println("WhatsApp _ calling " + contact + "...");
	}

	@Override
	public void sendMessage(String msg) {
		
		System.out.println("WpatsApp _ sending a message - " + msg + "...");
	}

}
