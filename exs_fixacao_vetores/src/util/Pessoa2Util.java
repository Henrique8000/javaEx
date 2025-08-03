package util;

import entities.Pessoa2;

public class Pessoa2Util {
	
	public static double pegaMenorAltura(Pessoa2[] pessoa) {
		double menorAlt = pessoa[0].getAltura();
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getAltura() < menorAlt) {
				menorAlt = pessoa[i].getAltura();
			}
		}
		return menorAlt;
	}
	
	public static double pegaMaiorAltura(Pessoa2[] pessoa) {
		double maiorAlt = pessoa[0].getAltura();
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getAltura() > maiorAlt) {
				maiorAlt = pessoa[i].getAltura();
			}
		}
		return maiorAlt;
	}
	
	public static double avgAlturaDasMulheres(Pessoa2[] pessoa) {
		double somaTotalAlt = 0.00;
		
		for (int i=0; i<pessoa.length; i++) {
			somaTotalAlt += pessoa[i].getAltura();
		}
		
		return somaTotalAlt / pessoa.length;
		
	}
	
	public static int numHomens(Pessoa2[] pessoa) {
		int manCounter = 0;
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getGenero() == 'M') {
				manCounter += 1;
			}
		}
		return manCounter;
	}
	
}
