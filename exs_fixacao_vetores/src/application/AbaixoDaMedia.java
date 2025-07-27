package application;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		
		double[] vect = new double[num];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		double avgNum = soma / vect.length;
		
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", avgNum);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < avgNum) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
