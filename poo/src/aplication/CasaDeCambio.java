package application;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class CasaDeCambio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? R$");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? U$");
		double dollarQuantity = sc.nextDouble();
		
		double priceWithTax = CurrencyConverter.amountToPay(dollarPrice, dollarQuantity);
		
		System.out.printf("Amount to be paid in reais = R$%.2f", priceWithTax);
		
		sc.close();
	}

}
