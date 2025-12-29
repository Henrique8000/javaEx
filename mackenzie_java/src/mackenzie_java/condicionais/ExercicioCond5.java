package mackenzie_java.condicionais;

/*
5. Uma transportadora precisa de um sistema rápido para calcular o valor do frete com base na sigla
do estado de destino. O sistema deve solicitar a sigla e usar uma expressão switch para retornar o
valor do frete. Utilizar a sintaxe moderna do switch como uma expressão (variavel = switch(...)) 
*/

import java.util.Scanner;
import java.util.Locale;

public class ExercicioCond5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual estado é o destino da encomenda? ");
		String estado = sc.nextLine();
		
		double frete = switch (estado) {
		case "SP", "RJ" -> 15.00;
		case "MG", "ES" -> 18.00;
		case "PR", "SC", "RS" -> 25.75;
		case "BA", "SE", "AL", "PE" -> 35.20;
		default -> 0.0;
		};
		
		if (frete != 0) {
			System.out.printf("%nVocê pagará: R$%.2f", frete);
		}
		else {
			System.out.println("\nO estado que você escolheu não existe... :(");
		}
		sc.close();

	}

}
