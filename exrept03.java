import java.util.Scanner;
import java.util.Locale;

//Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. o ultimo dado, 
//que não estará nos cálculos, contem um valor de idade negativa. calcular e imprimir a idade média deste grupo de 
//indivíduos. Se for entrado um valor negativo na primeira, mostrar a mensagem "impossível calcular".
//Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
//o ultimo dado, que não estará nos cálculos, contem um valor de idade negativa. calcular e imprimir a idade 
//média deste grupo de indivíduos. Se for entrado um valor negativo na primeira, mostrar a mensagem "impossível calcular".

public class exrept03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int idade = sc.nextInt();
		int soma = 0;
		int i = 0;
		
		while (idade >= 0) {
			soma += idade;
			i += 1;
			idade = sc.nextInt();
		}
		
		if (i > 0) {
			double media = (double) soma / i;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Impossível de calcular");
		}
		
		sc.close();

	}

}
