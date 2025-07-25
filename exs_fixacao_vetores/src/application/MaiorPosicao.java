package application;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		
		double[] vect = new double[num];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = 0.0;
		int index = 0;
		for (int i=0; i<vect.length; i++) {
			
			if (vect[i] > maior) {
				maior = vect[i];
				index = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + maior);
		
		System.out.println("POSICAO DO MAIOR VALOR = " + index);
		
		sc.close();

	}

}
