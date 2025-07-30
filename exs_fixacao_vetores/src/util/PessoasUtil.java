package util;

import entities.Pessoas;

public class PessoasUtil {
	
	public static void totalPessoaMenor(Pessoas[] pessoa) {
		System.out.println();
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
				}
			}
	}
	
	public static double percentMenores(Pessoas[] pessoa) {
		int qtdMenor = 0;
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				qtdMenor += 1;
			}
		}
		
		return (qtdMenor * 100.0) / pessoa.length; 
	}
	
	public static double avgAltura(Pessoas[] pessoa) {
		double somaAltura = 0.00;
		
		for (int i=0; i<pessoa.length; i++) {
			somaAltura += pessoa[i].getAltura();
		}
		
		return somaAltura / pessoa.length;
	}
	
}
