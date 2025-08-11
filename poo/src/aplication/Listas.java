package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Henrique");
		list.add("Tobi");
		list.add("Amanda");
		list.add("Pandora");
		list.add("Luke");
		list.add("Maggie");
		list.add("Michel");
		list.add("Ana");
		
		list.add(2, "Bob");
		
		//list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("Tamanho da lista: " + list.size());
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.printf("Indice do elemento '%s': %d%n", list.get(5), list.indexOf("Luke"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("===============================");
		for (String nome : result) {
			System.out.println(nome);
		}
		
		System.out.println("===============================");
		String name =  list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
		System.out.println(name);

	}

}
