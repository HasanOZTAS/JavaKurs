package day16_classObjects;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		CellPhone phone1 = new CellPhone();
		
		phone1.brand = "LG";
		phone1.screenSize = 5.3;
		phone1.color = "White";
		phone1.price = 2500;
		
		phone1.call();
		phone1.message();
		phone1.takeAphoto();
		
		System.out.println(phone1.brand+ " " + phone1.color + " " + phone1.screenSize + " " + phone1.price);
		
		phone1.call();
		phone1.message();
		phone1.takeAphoto();
		
		System.out.println("*******");
		
		CellPhone phone2 = new CellPhone();
		
		phone2.brand = "Samsung";
		phone2.screenSize = 6.6;
		phone2.color = "Black";
		phone2.price = 3500;
		
		System.out.println("### CELL 2 Values ###");
		System.out.println("Brand: " + phone2.brand);
		System.out.println("Screen Size: " + phone2.screenSize);
		System.out.println("Color: " + phone2.color);
		System.out.println("Price: " + phone2.price);
		
		phone2.call();
		phone2.message();
		phone2.takeAphoto();
		
		System.out.println();
		
		CellPhone phone3 = new CellPhone();		// nothing was assigned to phone3
		
		System.out.println(phone3.brand);
		System.out.println(phone3.color);
		System.out.println(phone3.screenSize);
		System.out.println(phone3.price);
		
		phone3.call();
		phone3.message();
		phone3.takeAphoto();

	}

}
