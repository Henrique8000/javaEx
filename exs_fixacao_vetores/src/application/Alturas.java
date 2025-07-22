package application;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;
import util.PessoasUtil;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i=0; i<pessoa.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoas(nome, idade, altura);
		}
		
		System.out.printf("%nAltura média: %.2f%n", PessoasUtil.avgAltura(pessoa));
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", PessoasUtil.percentMenores(pessoa));
		
		PessoasUtil.totalPessoaMenor(pessoa);
		
		sc.close();

	}
	
	
}
