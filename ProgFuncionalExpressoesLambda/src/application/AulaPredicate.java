package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class AulaPredicate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice() >= 100);
		
		/* Implementacao da interface
		list.removeIf(new ProductPredicate());
		*/
		
		/* Reference Method com método estático
		list.removeIf(Product::staticProductPredicate);
		*/
		
		/*Reference Method com método não estático
		list.removeIf(Product::nonStaticProductPredicate);
		*/
		
		/* Expressão lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);
		*/
		
		// Expressão lambda inline
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		list.forEach(System.out::println);
		
	}

}
