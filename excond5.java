package testeJava;

import java.util.Scanner;
import java.util.Locale;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

public class excond5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int item_id, qnt_item;
		double calcConta, preco;
		
		item_id = sc.nextInt();
		qnt_item = sc.nextInt();
		
		if (item_id == 1) {
			preco = 4.00;
			calcConta = preco * qnt_item;
			System.out.printf("Total: R$ %.2f", calcConta);
					}
		else {
			if (item_id == 2) {
				preco = 4.50;
				calcConta = preco * qnt_item;
				System.out.printf("Total: R$ %.2f", calcConta);
			}
			else {
				if (item_id == 3) {
					preco = 5.00;
					calcConta = preco * qnt_item;
					System.out.printf("Total: R$ %.2f", calcConta);
				}
				else {
					if (item_id == 4) {
						preco = 2.00;
						calcConta = preco * qnt_item;
						System.out.printf("Total: R$ %.2f", calcConta);
					}
					else {
						if (item_id == 5) {
							preco = 1.50;
							calcConta = preco * qnt_item;
							System.out.printf("Total: R$ %.2f", calcConta);
						}
					}
				}
			}
		}	
		
		sc.close();

	}

}
