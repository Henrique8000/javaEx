package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class SistemaDeNota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine().strip();
		
		aluno.nota1 = sc.nextDouble();
		sc.nextLine();
		aluno.nota2 = sc.nextDouble();
		sc.nextLine();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		
		sc.close();

	}

}
