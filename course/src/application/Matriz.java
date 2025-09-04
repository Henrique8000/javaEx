package application;

/*
Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.
 */

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				if (l == 0 && c ==0) {
					System.out.printf("%d ", mat[l][c]);
				}
				else if (l == 1 && c == 1) {
					System.out.printf("%d ", mat[l][c]);
				}
				else if (l == 2 && c == 2) {
					System.out.printf("%d", mat[l][c]);
				}
				else {
					
				}
			}
		}
		
		int countNegative = 0;
		
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				if (mat[l][c] < 0) {
					countNegative++;
				}
			}
		}
		
		System.out.printf("%nNegative numbers = %d", countNegative);
		sc.close();
	}

}
