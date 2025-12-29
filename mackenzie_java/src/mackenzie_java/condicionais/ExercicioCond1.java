package mackenzie_java.condicionais;

import java.util.Scanner;

public class ExercicioCond1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite A: ");
		a = sc.nextInt();
		
		System.out.print("Digite B: ");
		b = sc.nextInt();
		
		System.out.print("Digite C: ");
		c = sc.nextInt();
		
		if ((a + b > c) || (b + c > a) || (a + c > b)) {
			if ((a == b) && (b ==c)) {
				System.out.println("Equilátero");
			}
			else if ((a == b) || (b == c) || (a == c)) {
				System.out.println("Isósceles");
			}
			else {
				System.out.println("Escaleno");
			}
		}
		
		sc.close();

	}

}
