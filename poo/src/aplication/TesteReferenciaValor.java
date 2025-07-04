package application;

import entities.testePonteiro;

public class TesteReferenciaValor {

	public static void main(String[] args) {
		//Tipos valores
		int x = 2;
		int y = x; //y copia o valor de x
		
		System.out.printf("X = %d%n", x);
		System.out.printf("Y = %d%n", y);
		
		x = 3;
		
		System.out.printf("%nValor de X foi atualizado: %d%n", x);
		System.out.printf("Y é uma cópia da primeira referencia ao x: %d%n", y);
		
		y = 4;
		
		System.out.printf("%nAgora atualizamos o valor de Y: %d%n", y);
		
		//Tipos referencia
		testePonteiro p1, p2, p3;
		
		p1 = new testePonteiro("TV", 900.00, 1);
		
		p2 = p1;
		
		p3 = null; // não aponta para ninguem
		
		System.out.println();
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		
		double price = 500.00;
		
		p1.setPrice(price);
		
		System.out.println();
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		

	}

}
