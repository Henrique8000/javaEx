package estruturas_de_repticao;

/*
Crie um programa que peça ao usuário um número inteiro não negativo e calcule
seu fatorial. O fatorial de um número N (representado por N!) é o produto de todos os
inteiros de 1 até N. Lembre-se que 0! = 1.
 */

import java.util.Scanner;

public class ExercicioRept2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número");
		int n = sc.nextInt();
		
		while(n < 0) {
			System.out.println("Digite um número positivo: ");
			n = sc.nextInt();
		}
		
		sc.close();

	}

}
