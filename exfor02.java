import java.util.Scanner;

//leia valores inteiros x e y. A seguir, calcule e 
//mostre a soma dos números impares entre eles.
//O programa deve imprimir um valor inteiro. Este valor
//é a soma dos valores ímpares que estão entre os valores
//fornecidos na entrada que deverá caber em um inteiro.

public class exfor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.nextLine();
		int y = sc.nextInt();
		
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
	    }
		else {
		   min = y;
		   max = x;
	   }
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
						
		sc.close();
	
	}
		
		
	}
