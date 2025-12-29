package atividade_condicionais_lacos;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		
		int jovem = 0;
		
		int adultos = 0;
		
		int melhorIdade = 0;
		
		while (idade >= 0) {
			System.out.print("Qual a sua idade? ");
			idade = sc.nextInt();
			
			if (idade < 20 && idade >= 0) {
				jovem += 1;
			}
			else if (idade >= 20 && idade <= 59) {
				adultos += 1;
			}
			else if (idade >= 60) {
				melhorIdade += 1;
			}
		}
		
		System.out.printf("Total jovens: %d%n", jovem);
		System.out.printf("Total adultos: %d%n", adultos);
		System.out.printf("Total melhor idade: %d%n", melhorIdade);
		
		sc.close();
	}

}
