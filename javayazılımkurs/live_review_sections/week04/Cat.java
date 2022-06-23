package week04;

public class Cat {
	
	public String name;
	public int age;
	public String breed;
	public String color;
	public String size;
	
	
	
	public void setInfo(String catName, int catAge, String catBreed, String catColor, String catSize) {
		name = catName;
		age =catAge;
		breed= catBreed;
		color= catColor;
		size = catSize;
	
	}	// responsibel for setting the informations/attributes of the cat
	
	
	
	public void eats(String food) {
		System.out.println(name + " is eating " + food);
	}
	
	public void drinks (String drinks) {
		System.out.println(name + " is drinking " + drinks);
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping ");
	}

	
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", breed=" + breed + ", color=" + color + ", size=" + size + "]";
	}
	
	
	
	
	

}
