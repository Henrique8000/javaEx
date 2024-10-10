import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e 
//mostre a divisão do primeiro pelo segundo. Se o denominador for igual a 
//zero, mostrar a mensagem "divisao impossivel"


public class exfor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdVzs = sc.nextInt();
		
		for (int i = 0; i<qtdVzs; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) n1 / n2;
				System.out.println(divisao);
			}
			
		}
		
		sc.close();
	}

}
