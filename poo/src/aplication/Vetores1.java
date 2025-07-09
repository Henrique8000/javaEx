package application;
import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		double mediaFinal = soma / vect.length;
		
		System.out.printf("%nAVERAGE HEIGHT: %.2f", mediaFinal);
		
		sc.close();

	}

}
