package desafio_matriz;

import java.util.Scanner;

public class MatrizDesafio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De quantas linhas e colunas será a sua Matriz?");
		
		System.out.print("Linhas -> ");
		int m = sc.nextInt();
		
		System.out.print("Colunas -> ");
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		System.out.printf("%nPreencha a sua matriz %dX%d:%n", m, n);
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.print("\nInsira um numero inteiro: ");
		int x = sc.nextInt();
		
		for (int l=0; l<mat.length; l++) {
			for (int c=0; c<mat[l].length; c++) {
				
				if (mat[l][c] == x) {
					
					System.out.printf("Position %d,%d:%n", l, c);
					
					if (c+1 < mat[l].length && c+1 >= 0) {
						System.out.printf("Right: %d%n", mat[l][c+1]);
					}
					
					if (c-1 < mat[l].length && c-1 >= 0) {
						System.out.printf("Left: %d%n", mat[l][c-1]);
					}
					
					if (l-1 < mat[l].length && l-1 >= 0) {
						System.out.printf("Up: %d%n", mat[l-1][c]);
					}
				
					if (l+1 < mat[l].length && l+1 >= 0) {
						System.out.printf("Down: %d%n", mat[l+1][c]);
					}
					
				}
				System.out.println();
			}
		}
				
		sc.close();
	}
	
}
