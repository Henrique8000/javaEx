package estrutura_condicional;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class excond2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, poui;
		
		System.out.print("Isira um número inteiro: ");
		num = sc.nextInt();
		
		poui = num % 2;
		
		if (poui == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		
		sc.close();
	}

}
