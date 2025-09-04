/*
Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdVect;

public class Vetores2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdVect[] vect = new ProdVect[n]; 
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProdVect(name, price);
		}
		
		double soma = 0.00;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double mediaFinal = soma / vect.length;
		
		System.out.printf("%nAVERAGE PRICE = R$%.2f", mediaFinal);
		
		
		sc.close();

	}

}
