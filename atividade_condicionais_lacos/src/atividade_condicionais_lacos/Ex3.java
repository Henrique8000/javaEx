package atividade_condicionais_lacos;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco1, preco2, preco3, preco4, preco5;
		int count = 0;
		
		
		System.out.print("Preço no mercado ABC: R$");
		double precoAbc = sc.nextDouble();
		
		
		for (int i=0; i<5; i++) {
			System.out.printf("Preco mercado %d: ", i+1);
			preco1 = sc.nextDouble();
			
			if (preco1 > precoAbc) {
				count += 1;
			}
		}
	
		System.out.printf("\nTotal de lojas mais caras que o Mercado ABC: %d", count);
		
		
		sc.close();
	}

}
