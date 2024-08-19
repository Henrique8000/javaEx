package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

//Uma operadora de telefone cobra R$50.00 por um plano básico que
//dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia
//de 100 minutos custa R$2.00 .Fazer um programa para ler a quantidade de
//minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

public class excond12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int mim = sc.nextInt();

		double totalPagar = 50.0;
		if (mim > 100) {
			totalPagar += (mim - 100) * 2.00;
			System.out.printf("Valor a pagar: R$%.2f", totalPagar);
		} else {
			System.out.println("Valor a pagar: R$50.00");
		}
		sc.close();
	}

}
