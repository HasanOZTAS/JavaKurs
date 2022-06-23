package Exercises;

public class change {

	public static void main(String[] args) {
		
		
		
		final int bill = 100;

        int price = 45;

        int change = bill - price;


        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        while (change >= 25){
            quarters = quarters + 1;
            change = change - 25;
        }
        while (change >= 10){
            dimes = dimes + 1;
            change = change - 10;
        }
        while (change >= 5){
            nickels = nickels + 1;
            change = change - 5;
        }

        System.out.println("Price in cents : " + price);
        System.out.println("Your change is "+ quarters + " quarters, " + dimes + " dimes, and " +  nickels + " nickels" );

	}

}
