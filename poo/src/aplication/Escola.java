/*
 Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class Escola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		student.nota1 = sc.nextDouble();
		sc.nextLine();
		
		student.nota2 = sc.nextDouble();
		sc.nextLine();
		
		student.nota3 = sc.nextDouble();
		
		double mediaFinal = student.finalGrade();
		
		System.out.printf("%nFINAL GRADE = %.2f", mediaFinal);
		
		System.out.print("\n" + student.passOrFail(mediaFinal));
		
		
		sc.close();

	}

}
