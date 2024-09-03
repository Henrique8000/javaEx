import java.util.Scanner;
import java.util.Locale;

//Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem 
//que indique se estes valores forem digitados em ordem crescente ou decrescente.
//A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
//A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
//Para cada caso de teste imprima "Crescente", caso os valores tenham sido digitados na ordem crescente, 
//caso contrário imprima a mensagem "Decrescente".

public class exrept02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("Decrescente");

			} 
			else {
				System.out.println("Crescente");

			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		System.out.println("Os números de entrada são iguais \nFinalizando...");
		sc.close();

	}

}
