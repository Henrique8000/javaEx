package application;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa2;
import util.Pessoa2Util;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int num = sc.nextInt();
		
		Pessoa2[] pessoa = new Pessoa2[num];
		
		for (int i=0; i<pessoa.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double altura = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			
			pessoa[i] = new Pessoa2(altura, genero);
		}
		
		
		System.out.printf("Menor altura = %.2f%n", Pessoa2Util.pegaMenorAltura(pessoa));
		System.out.printf("Maior altura = %.2f%n", Pessoa2Util.pegaMaiorAltura(pessoa));
		System.out.printf("Media das alturas das mulheres = %.2f%n", Pessoa2Util.avgAlturaDasMulheres(pessoa));
		System.out.printf("Numero de homens = %d", Pessoa2Util.numHomens(pessoa));
		
		sc.close();

	}

}
