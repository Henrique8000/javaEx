package estruturas_de_repticao;

import java.util.Scanner;

/*
Escreva um programa que peça ao usuário para digitar um número inteiro positivo
e calcule a soma de todos os seus dígitos. Por exemplo, para o número 123, a soma
seria 1 + 2 + 3 = 6.
 */

public class ExercicioRept1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = sc.nextInt();
		
		int c = num / 100;
		int d = (num % 100) / 10;
		int u = (num % 100) % 10;
		
		int soma = c + d + u;
		
		System.out.println(soma);
		
		sc.close();
	}

}
