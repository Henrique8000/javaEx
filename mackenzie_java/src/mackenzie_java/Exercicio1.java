package mackenzie_java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		String nome;
		String cargo;
		String cel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		cargo = JOptionPane.showInputDialog("Digite seu cargo");
		
		System.out.print("Digite o seu cel: ");
		cel = sc.nextLine();
		
		String limites ="+-----------------------------------------+";	
			
		System.out.println(limites);
		System.out.printf("| %-39s |", "Nome: " + nome);
		System.out.printf("%n| %-39s |", "Cargo: " + cargo);
		System.out.printf("%n| %-39s |%n", "Cel: " + cel);
		System.out.println(limites);
		
		sc.close();
	}
}
