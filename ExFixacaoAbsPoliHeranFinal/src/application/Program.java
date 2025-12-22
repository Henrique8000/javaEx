package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Tax payer #%d data:%n", i+1);
			
			System.out.print("Individual or company (i/c)? ");
			Character op = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			if (op == 'i') {
				
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				Pessoa pf = new PessoaFisica(name, income, healthExpenditures);
				
				pessoas.add(pf);
			}
			else {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				Pessoa pj = new PessoaJuridica(name, income, numberOfEmployees);
				
				pessoas.add(pj);
			}
			
			System.out.println();
			
		}
				
		double total = 0.0;
		
		System.out.println("\nTAXES PAID:");
		for (Pessoa p : pessoas) {
			System.out.printf("%s: $ %.2f", p.getNome(), p.imposto());
			System.out.println();
			
			total += p.imposto();
		}
		
		System.out.printf("%nTOTAL TAXES: $ %.2f", total);
		sc.close();
	}

}
