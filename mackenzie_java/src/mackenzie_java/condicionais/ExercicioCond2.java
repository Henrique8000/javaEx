package mackenzie_java.condicionais;

import java.util.Locale;
import java.util.Scanner;

/*
2. Desenvolva um programa para o caixa de uma cafeteria. O programa deve exibir um menu simples, permitir que o
usuário escolha um produto e a quantidade, e em seguida, escolher a forma de pagamento. O sistema deve aplicar
descontos com base na forma de pagamento.
 */

public class ExercicioCond2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int qtd = 0;
		double expresso = 4.5;
		double capuccino = 6.0;
		double machiatto = 7.5;

		System.out.println("----- MENU -----");
		System.out.println("1 - Expresso - R$4,50");
		System.out.println("2 - Capuccino - R$6,00");
		System.out.println("3 - Machiatto - R$7,50");
		
		System.out.print("\nDigite uma opção: ");
		int opc = sc.nextInt();
		
		if (opc >= 1 && opc <= 3) {
			System.out.print("Digite a  qtd: ");
			qtd = sc.nextInt();

			switch (opc) {
			case 1:
				total = expresso * qtd;
				break;
			case 2:
				total = capuccino * qtd;
				break;
			case 3:
				total = machiatto * qtd;
				break;
			}

			System.out.println("----- Pagamento -----"); 
			System.out.println("1 - Débito (10% de desconto)");
			System.out.println("2 - Crédito (5% de desconto)");
			System.out.println("3 - Dinheiro (sem desconto)");
			System.out.println("Digite sua opção: ");

			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				total = total * 0.9;
				break;
			case 2:
				total = total * 0.95;
				break;
			}
			System.out.println("Total: " + total);

		} else {
			System.out.println("Opção inválida");
		}

		sc.close();
	}

}
