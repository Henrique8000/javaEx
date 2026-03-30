package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class AulaFunction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		/* Implementação da Interface
		List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		nomes.forEach(System.out::println);
		*/
		
		
		/* Reference Method com método estático
		List<String> nomes = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		*/
		
		
		/* Reference Method com método não estático
		List<String> nomes = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		*/
		
		
		/* Expressão lambda declarada
		Function<Product, String> upperCaseName = p -> p.getNome().toUpperCase();
		List<String> nomes = list.stream().map(upperCaseName).collect(Collectors.toList());
		*/
		
		
		// Expressão lambda inline
		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
		//list.forEach(System.out::println);
		
	}

}
