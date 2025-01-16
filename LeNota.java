import java.util.Locale;
import java.util.Scanner;

/*
 Faça um programa que peça uma nota, entre zero e dez. 
 Mostre uma mensagem caso o valor seja inválido e continue 
 pedindo até que o usuário informe um valor válido.
 */

public class LeNota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a sua nota: ");
		double nota = sc.nextDouble();
		
		if (nota < 0 || nota > 10) {
			while (nota < 0 || nota > 10) {
				System.out.print("\nInsira uma nota dentro do intervalo de (0 - 10) ");
				nota = sc.nextDouble();
			}
		}

		System.out.printf("%.2f", nota);
		
		sc.close();
	}

}
