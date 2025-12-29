package atividade_condicionais_lacos;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert your current salary: ");
		double empSalary = sc.nextDouble();
		double increaseSalary = 0.00;
		
		if (empSalary <= 2000.00) {
			increaseSalary = (empSalary * 40) / 100;
			empSalary += increaseSalary;
		}
		else if (empSalary > 2000.00 && empSalary <= 3000.00) {
			increaseSalary = (empSalary * 30) / 100;
			empSalary += increaseSalary;
		}
		else if (empSalary > 3000.00 && empSalary <= 4000.00) {
			increaseSalary = (empSalary * 20) / 100;
			empSalary += increaseSalary;
		}
		else if (empSalary > 4000.00 && empSalary <= 5000.00) {
			increaseSalary = (empSalary * 10) / 100;
			empSalary += increaseSalary;
		}
		else if (empSalary > 5000.00) {
			System.out.println("No increase available");
		}
		else {
			System.out.println("Value must be positive");
		}
		
		System.out.printf("%nIncreasement: %.2f", increaseSalary);
		System.out.printf("%nUpdated salary: %.2f", empSalary);
		
		sc.close();
	}
}
