package application;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int num = sc.nextInt();
		
		String[] nomes = new String[num];
		int[] idades = new int[num];
		
		for (int i=0; i<num; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int idade = 0;
		String name = "";
		for (int i=0; i<idades.length; i++) {
			if (idades[i] > idade) {
				idade = idades[i];
				name = nomes[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", name);
		
		sc.close();
	}

}
