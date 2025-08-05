package application;

import java.util.Scanner;

import entities.Pensionista;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pensionista[] pensionista = new Pensionista[9];
		
		
		System.out.print("How many rooms will be rented? ");
		int numRooms = sc.nextInt();
		
		System.out.println();
		for (int i=0; i<numRooms; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n", i+1);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			pensionista[room] = new Pensionista(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<pensionista.length; i++) {
			if (pensionista[i] != null) {
				System.out.printf("%d: %s, %s%n", i, pensionista[i].getName(), pensionista[i].getEmail());
			}
		}
			
		sc.close();
	}

}
