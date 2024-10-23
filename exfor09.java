import java.util.Scanner;
import java.lang.Math;

/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. . Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
conforme exemplo.
*/

public class exfor09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro positivo: ");
		int n = sc.nextInt();
		
		for(int line=1; line<n+1; line++) {
			int pot2 = (int) Math.pow(line, 2);
			int pot3 = (int) Math.pow(line, 3);
			System.out.printf("%d %d %d%n", line, pot2, pot3);
		}
		
		sc.close();

	}

}
