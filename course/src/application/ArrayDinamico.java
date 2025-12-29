package application;

import java.util.ArrayList;

public class ArrayDinamico {

	public static void main(String[] args) {
		
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		
		//Adicionando elementos ao ArrayList
		arrayDinamico.add("Henrique");
		arrayDinamico.add("Luke");
		arrayDinamico.add("Amanda");
		arrayDinamico.add("Tobi");
		arrayDinamico.add("Maggie");
		
		//Percorrendo o ArrayList com For Each
		System.out.println("=============================");
		for (String nome : arrayDinamico) {
			System.out.println(nome);
		}
		
		//Percorrendo o ArrayList com um Laço For padrão
		System.out.println("=============================");
		for (int i=0; i<arrayDinamico.size(); i++) {
			System.out.println(arrayDinamico.get(i));
		}
		
		
				
	}

}
