package day16_classObjects;

public class ContactObjects {

	public static void main(String[] args) {
		
		Contact contact1 = new Contact();
		
		contact1.name = "Hasan";
		contact1.phoneNumber = "+90 555 555 55 55";
		contact1.email = "Hasan@hasan.com";
		
		System.out.println("Name: " + contact1.name + " Phone Number: " + contact1.phoneNumber + " Email: " + contact1.email);
		
		System.out.println();
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
			
		

	}

}
