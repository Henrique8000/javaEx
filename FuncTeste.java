import java.util.Scanner;
import java.util.Locale;

// Fazer um programa para ler 3 numeros e mostrar na tela o maior deles

public class FuncTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		int n2 = sc.nextInt();
		sc.nextLine();
		int n3 = sc.nextInt();
		
		
		int maior = verificaNumeroMaior(n1, n2, n3);
		showResult(maior);
		System.out.printf("media entre os três numeros: %.2f", mediaTresNotas(n1, n2, n3)); 
		
		sc.close();
	}
	
	public static int verificaNumeroMaior(int a, int b, int c) {
		
		int max; 
		if(a > b && a > c) {
			max = a;
		}
		else if(b > a && b > c) {
			max = b;
		}
		else {
			max = c;
		}
		return max;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	public static double mediaTresNotas(double x, double y, double z) {
		double media = (x + y + z) / 3;
		return media;
	}

}
