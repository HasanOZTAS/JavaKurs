package day48_collection_part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		
		// create set collection and add new products
		
		//Set<Product> products = new HashSet<>();
		Set<Product> products = new TreeSet<>();
		
		products.add(new Product("book", 25.99));
		products.add(new Product("book", 17.99));
		products.add(new Product("magazine", 7.99));
		
		System.out.println(products);
		
		// print each product by using forEach loop
		for(Product prod : products) {
			System.out.println(prod.getPrice());
		}
		
		
		// print each product by using forEach() method
		products.forEach(p -> System.out.println(p.getName()));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
