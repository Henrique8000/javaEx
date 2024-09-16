import java.util.Scanner;


public class testeFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println("");
		
		for (int a = 10; a>0; a--) {
			System.out.println("Valor de a: " + a);
		}
		
		sc.close();
	}

}
