package application;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
 */

import java.util.Scanner;
import java.util.Locale;

import util.NumUtils;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vectNumReais = new double[n];
		
		for (int i=0; i<vectNumReais.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vectNumReais[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		NumUtils.valores(vectNumReais);
		
		System.out.printf("%nSOMA = %.2f", NumUtils.soma(vectNumReais));
		
		System.out.printf("%nMEDIA = %.2f", NumUtils.media(vectNumReais));
		
		sc.close();
	}

}
