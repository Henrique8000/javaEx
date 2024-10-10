import java.util.Scanner;
import java.util.Locale;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

public class exfor05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o seu nome: ");
		String a = sc.nextLine().toUpperCase().strip().replace(" ", "");
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double mediaP = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", mediaP);
		}
		
		System.out.println('\n' + a);
		
		
		sc.close();

	}

}
