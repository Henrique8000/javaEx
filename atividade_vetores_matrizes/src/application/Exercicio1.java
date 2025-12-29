package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] v = new int[] {10, 20, 30, 40};
		int[] v1 = new int[5]; 
		
		double m = media(v);
		
		vetorVazioOuNao(m);
		
		sc.close();
	}
	
	
	public static double media(int[] v) {
		Locale.setDefault(Locale.US);
		
		double media = 0.0;
		double soma = 0;
		
		for (int i=0; i<v.length; i++) {
			soma += v[i];
		}
		
		if (soma == 0) {
			return media;
		}
		else {
			media = soma / (v.length);
			return media;
		}
		
		

	}
	
	public static void vetorVazioOuNao(double m) {
		if (m != 0.0) {
			System.out.printf("%.1f", m);
		}
		else {
			System.out.println("O vetor está vazio!!");
		}
	}
	
}
