package application;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
 */

import java.util.Locale;
import java.util.Scanner;

public class SomaVetoresSuprema {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int num = sc.nextInt();
		
		int[] vectA = new int[num];
		int[] vectB = new int[num];
		int[] vectC = new int[num];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<vectA.length; i++) {
			sc.nextLine();
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<vectB.length; i++) {
			sc.nextLine();
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();

	}

}
