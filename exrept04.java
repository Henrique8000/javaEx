import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

public class exrept04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a coordenada X: ");
		int x = sc.nextInt();

		sc.nextLine();

		System.out.print("Insira a coordenada Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("\nprimeiro\n");
				
			} else if (x > 0 && y < 0) {
				System.out.println("\nquarta\n");
			
			} else if (x < 0 && y < 0) {
				System.out.println("\nterceiro\n");
			
			} else {
				System.out.println("\nsegundo\n");
			
			}
			
			System.out.print("Insira a coordenada X: ");
			x = sc.nextInt();
			sc.nextLine();
			System.out.print("Insira a coordenada Y: ");
			y = sc.nextInt();
		}

		System.out.println("Uma das coordenadas são nulas! Finalizando...");

		sc.close();

	}

}
