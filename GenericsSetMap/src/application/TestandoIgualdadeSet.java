package application;

import java.util.HashSet;
import java.util.Set;

import entities.ProductSet;

public class TestandoIgualdadeSet {
	public static void main(String[] args) {
		
		Set<ProductSet> set = new HashSet<>();
		
		set.add(new ProductSet("TV", 900.0));
		set.add(new ProductSet("Notebook", 1200.0));
		set.add(new ProductSet("Tablet", 400.0));
		
		ProductSet prod = new ProductSet("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}
}