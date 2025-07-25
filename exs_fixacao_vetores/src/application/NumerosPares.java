package application;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
 */

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		
		int[] arrayNums = new int[num];
		
		for (int i=0; i<arrayNums.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			arrayNums[i] = sc.nextInt();
		}
		
		int qtdPares = 0;
		
		System.out.println("\nNUMEROS PARES:");
		for (int i=0; i<arrayNums.length; i++) {
			if (arrayNums[i] % 2 == 0) {
				
				if (arrayNums[i] == arrayNums[0]) {
					System.out.print(arrayNums[i]);
				}
				
				else {
					System.out.print(" " + arrayNums[i]);
				}
				
				qtdPares += 1;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdPares);
		
		sc.close();
		
		}
	}
	