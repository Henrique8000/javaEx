/*
Desenvolva um programa que leia o preço e a quantidade de 3 itens e exiba uma
tabela com \t, subtotal de cada item e total geral (formate com 2 casas).
 */

package mackenzie_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p1, p2, p3;
		int qtd1, qtd2, qtd3;
		double total;
		
		System.out.print("Preco 1: ");
		p1 = sc.nextDouble();
		
		System.out.print("Quantidade 1: ");
		qtd1 = sc.nextInt();
		
		System.out.print("\nPreco 2: ");
		p2 = sc.nextDouble();
		
		System.out.print("Quantidade 2: ");
		qtd2 = sc.nextInt();
		
		System.out.print("\nPreco 3: ");
		p3 = sc.nextDouble();
		
		System.out.print("Quantidade 3: ");
		qtd3 = sc.nextInt();
		
		total = (p1 + p2 + p3) * (qtd1 + qtd2 + qtd3);
		
		System.out.println("\nItem\tQtde\tUnit\tSubtotal");
		System.out.printf("1\t%d\t%.2f\t" + qtd1 * p1, qtd1, p1);
		System.out.printf("%n2\t%d\t%.2f\t" + qtd2 * p2, qtd2, p2);
		System.out.printf("%n3\t%d\t%.2f\t" + qtd3 * p3, qtd3, p3);
		System.out.println("\n------------------------------");
		System.out.printf("Total: \t\t\t%.2f", total);
		
		sc.close();

	}

}
