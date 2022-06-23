package week05;

public class Pizza {
	
	/*
	Pizza:
        attribue:
            size
            cheeseTopping
            pepperoniTopping
          Actions:
                setInfo(), calculatePrice(), toString()
                assume that:
                    size:
                        small ==> $10
                        medium ==> $11
                        large ==> $12

                    one cheese topping 1$
                    one pepperoni topping 2$
	*/
	
	public String size;
	public int cheeseTopping;
	public int pepperoniTopping;
	
	
	public void customizeOrder (String pizzaSize, int cheese, int pepperoni) {
		
		size = pizzaSize;
		cheeseTopping = cheese;
		pepperoniTopping = pepperoni;
	}
	
	public double calculatePrice() {
		
		int startingPrice = (size.equals("Small")) ? 10 : (size.equals("Medium")) ? 12 : 14;
		
		int totalPriceOfCheese = 1 *  cheeseTopping;
		int totalPriceOfPepperoni = 2 * pepperoniTopping;
		
		return startingPrice + totalPriceOfCheese + totalPriceOfPepperoni;		
	}

	
	public String toString() {
		return "Pizza [size=" + size + ", cheeseTopping=" + cheeseTopping +
				", pepperoniTopping=" + pepperoniTopping
				+ ", total price=$"+calculatePrice() +"]";
	}
	
	
	
	

}
