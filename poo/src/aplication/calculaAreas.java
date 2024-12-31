package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Trapezio;


public class calculaAreas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean menu = true;
		int op;
		
		while (menu) {
			System.out.println("~=~=~=~=~=~=~=~=~=~=");
			System.out.println("CALCULADORA DE ÁREAS");
			System.out.println("~=~=~=~=~=~=~=~=~=~=");
			
			System.out.println("\n1. Área do Trapézio");
			
			System.out.print("\nInsira uma opção de 1 a 4: ");
			op = sc.nextInt();
			
			if (op == 1) {
				
				Trapezio a;
				a = new Trapezio();
				double areaTrapezio = calculaAreaTrapezio(sc, a);
				
				System.out.printf("%nA área do seu trapézio é: %.2fm²%n", areaTrapezio);
				
			}
			
			else if (op == 4) {
				System.out.println("\nFinalizando o programa...");
				menu = false;
			}
		}
		
		sc.close();
	}
	
	public static double calculaAreaTrapezio(Scanner sc, Trapezio a) {
		System.out.print("Insira o valor da base maior: ");
		a.B = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Insira o valor da base menor: ");
		a.b = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Insira a altura do trapézio: ");
		a.h = sc.nextDouble();
		
		double areaT = ((a.B + a.b) * a.h) / 2;
		
		return areaT;
		
	}

}
