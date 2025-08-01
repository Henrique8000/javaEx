package application;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int num = sc.nextInt();
		
		Aluno[] aluno = new Aluno[num];
		
		for (int i=0; i<aluno.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
			String nome = sc.nextLine();
			Double n1 = sc.nextDouble();
			Double n2 = sc.nextDouble();
			
			aluno[i] = new Aluno(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<aluno.length; i++) {
			if ((aluno[i].getNota1() + aluno[i].getNota2()) / 2 >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}
		sc.close();
	}

}
