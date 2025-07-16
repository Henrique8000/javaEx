package util;

public class NumUtils {
	
	public static void valores(double[] vect) {

		System.out.print("VALORES =");
		for (int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i]);
		}
	}
	
	public static double soma(double[] vect) {
		double soma = 0.00;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		return soma;
	}
	
	public static double media(double[] vect) {
		return soma(vect) / vect.length;
	}
	
}
