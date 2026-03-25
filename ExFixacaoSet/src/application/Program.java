package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import model.entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			
			Set<Aluno> alunosCurso = new HashSet<>();
			
			System.out.print("How many studants for course A? ");
			int numA = sc.nextInt();
			
			addAluno(numA, alunosCurso, sc);
			
			System.out.print("How many studants for course B? ");
			int numB = sc.nextInt();
			
			addAluno(numB, alunosCurso, sc);
			
			System.out.print("How many studants for course C? ");
			int numC = sc.nextInt();
			
			addAluno(numC, alunosCurso, sc);
			
			System.out.print("Total students: " + alunosCurso.size());
			
		}
		catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void addAluno(Integer n, Set<Aluno> x, Scanner sc) {
		for (int i=0; i<n; i++) {
			int id = sc.nextInt();
			x.add(new Aluno(id));
		}
	}

}
