package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	
	public static double amountToPay(double cotacao, double dollars) {
		double valNoTax = dollars * cotacao;
		return valNoTax + (valNoTax * (IOF / 100));
		
	}

}
