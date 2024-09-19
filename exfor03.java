import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os 
//ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

public class exfor03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		if (x <= 1000 && x > 0) {
			for (int i = 1; i <= x; i++) {
				boolean primo = i % 2 == 1;
				if (primo == true) {
					System.out.println(i);
				} else {

				}
			}
			sc.close();
		}
	}
}