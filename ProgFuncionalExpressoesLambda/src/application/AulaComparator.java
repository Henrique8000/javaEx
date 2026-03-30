package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class AulaComparator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		//Usando Collections + Comparable
		//Collections.sort(list);
		
		
		//Comparator objeto de classe separada
		//list.sort(new MyComparator());
		
		
		//Implementacao do Comparator usando classe anonima
		/*Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};
		
		list.sort(comp);
		*/
		
		
		/*Comparator de objeto de expressao lambda com chaves
		Comparator<Product> comp = (p1, p2) -> { 
		  return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		 };
		*/
	
		
		// Usando uma funcao anonima/expressao lambda 
		/*Comparator<Product> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		list.sort(comp);
		*/
		
		
		//passando a funcao anonima/expressao lambda como parametro
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
