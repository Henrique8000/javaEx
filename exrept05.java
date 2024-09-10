import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo

public class exrept05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean cont = true;

		int a = 0;
		int g = 0;
		int d = 0;
		int opcao = 0;

		while (cont) {
			System.out.println("informe qual tipo de combustivel você mais usa: ");
			System.out.println("1.Álcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim\n");
			opcao = sc.nextInt();

			if (opcao == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", a, g, d);
				cont = false;

			} else if (opcao == 1) {
				a += 1;
				
			} else if (opcao == 2) {
				g += 1;
			
			} else if (opcao == 3) {
				d += 1;
				
			} else {				
			
			}
			
		}

		sc.close();

	}

}
