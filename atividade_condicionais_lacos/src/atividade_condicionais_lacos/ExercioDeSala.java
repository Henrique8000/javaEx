package atividade_condicionais_lacos;

import java.io.IOException;
import java.util.Scanner;

public class ExercioDeSala {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int opc;
		
		do {
			System.out.println("-:: Menu de opções ::-");
			System.out.println("1.Adicionar um novo contato");
			System.out.println("2.Pesquisar por um contato");
			System.out.println("3.Remover um contato");
			System.out.println("4.Sair");
			System.out.print("Opção: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Adicionar");
				break;
			}
			
		} while(opc != 4);*/
		
		System.out.printf("%.2f", somaDoida());
		
		sc.close();
		
	}
	
	public static void lacoMaluco() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=0; i<=10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num * i);
		}
		sc.close();
	}
	
	public static double somaDoida() {		
		double somatorio = 0.0;
		
		for (int i=1; i<=50; i++) {
			somatorio += ((2.0 * i) - 1) / (i+1);
		}
		return somatorio;
	}
}
