package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

//Fazer um programa para ler três números inteiros. Em seguida, mostrar qual
//o menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez

public class excond11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x == y && x == z) {
			System.out.println("MENOR: " + x);
		}
		else if (x < y && x < z) {
			System.out.println("MENOR: " + x);
		}
		else if (y < x && y < z) {
			System.out.println("MENOR: " + y);
		}
		else {
			System.out.println("MENOR: " + z);
		}
		
		sc.close();
		

	}

}
