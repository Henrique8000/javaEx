package application;

/*
 Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		while (n<=0 || n>10) {
			System.err.println("Atenção! Você não pode digitar um número menor ou igual a 0 e maior que 10!");
			System.out.print("\nQuantos números você vai digitar? ");
			sc.nextLine();
			n = sc.nextInt();
		}
		
		int vect[] = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();
			
			vect[i] = num;
		}
		
		System.out.println("\nNÚMEROS NEGATIVOS:");
		
		for (int i=0; i<vect.length; i++)
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		
		sc.close();

	}

}
