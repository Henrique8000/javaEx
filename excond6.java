package testeJava;

import java.util.Scanner;
import java.util.Locale;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

public class excond6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double val = sc.nextDouble();
		
		if (val < 0 || val > 100) {
			System.out.print("Fora do intervalo");
		}
		else {
			if (val >= 25.01 && val <= 50) {
				System.out.println("Intervalo (25, 50)");
			}
			else {
				if (val >= 50.01 && val <= 75) {
					System.out.println("Intervalo (50, 75)");
				}
				else {
					if (val >= 75.01 && val <= 100) {
						System.out.println("Intervalo (75, 100)");
					}	
					else {
						if (val >= 0 && val <= 25) {
							System.out.println("Intervalo (0, 25)");
						}
					}
				}
			}
		}
		
		sc.close();
		

	}

}
