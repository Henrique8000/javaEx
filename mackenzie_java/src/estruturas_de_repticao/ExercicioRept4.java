package estruturas_de_repticao;

import java.util.Scanner;

public class ExercicioRept4 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		for (int i=num; i>=0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		sc.close();

	}

}
