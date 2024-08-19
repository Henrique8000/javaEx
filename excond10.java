package testeJava;

import java.util.Locale;
import java.util.Scanner;


//Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação
//de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente 'impossível calcular', caso haja
//uma divisão por 0 ou raiz de numero negativo

public class excond10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Insira o valor A: ");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.print("Insira o valor B: ");
		b = sc.nextDouble();
		sc.nextLine();
		System.out.print("Insira o valor C: ");
		c = sc.nextDouble();
		
		double delta = (Math.pow(b, 2) - (4 * a * c));
		
		if (a == 0 || delta <= 0) {
			System.out.println("\nimpossivel calcular");
		}
		else {
			
			double r1 = (- b + Math.sqrt(delta)) / (2 * a);
			double r2 = (- b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f%nR2 = %.5f", r1, r2);
		}
		sc.close();
	}

}
