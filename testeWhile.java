import java.util.Scanner;

// Fazer um programa que lê números inteiros até que um
// zero seja lido. Ao final mostrar a soma dos números.

public class testeWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int soma = 0;
	
		while (num != 0) {
			soma += num;
			num = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
