package estruturas_de_repticao;

import java.util.Scanner;

public class ExercicioRept5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String secreta = "AULA JAVA";
		
		String letra = "";
		int tentativas = 6;
		boolean acertou = false;
		String palavra_certa = "";
		
		while (tentativas > 0 && !acertou) {
			for (int i=0; i < secreta.length(); i++) {
				System.out.println("_ ");
			}
			System.out.println("\nDigite uma letra: ");
			letra = sc.nextLine();
			tentativas--;
		}
		
		if (acertou) {
			System.out.println("Parabéns vc acertou");
		}
		else {
			System.out.println("Não acertou a palavra que era " + secreta);
		}
		
		sc.close();

	}

}
