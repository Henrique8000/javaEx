import java.util.Scanner;


//Fazer um programa que lê um valor inteiro N e depois N números
//inteiros. Ao final, mostra a soma dos N números lidos.

public class testeFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
								
		int n = sc.nextInt();  //variável que recebe quantidade de vezes que serão inseridos numeros para somar
		
		int soma = 0; //variável que armazena o valor de x para somar-lo com os valores novos futuramente dados a x 
		
		for (int i = 0; i < n; i++) { 
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println("soma = " + soma);
		
		
		sc.close();
		

	}

}
