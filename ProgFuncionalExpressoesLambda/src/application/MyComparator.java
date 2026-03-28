package application;

import java.util.Comparator;

import entities.Product;

// Comparator de objeto de classe separada
public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}
		
}
