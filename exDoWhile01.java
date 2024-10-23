import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler uma temperatura em Celcius e mostrar o
//equivalente em Fahrenheit se o usuário desejar repetir (s/n). Caso o
//usuário digite "s", repetir o programa.

public class exDoWhile01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char opcao;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0; 
			
			System.out.printf("Equivalente em Fahrenheit: %.1f", F);
			System.out.print("\nDeseja repetir (s/n)? ");
			
			opcao = sc.next().charAt(0);
			
		} while(opcao == 's');
			
		sc.close();
	}

}
