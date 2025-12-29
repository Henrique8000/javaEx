package	java_exercises;

import java.util.Arrays;

// Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;


public class Arrays9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect = {25, 14, 56, 15, 36};
		
		int posicao = 2;
		int novoValor = 35;
		
		System.out.println(Arrays.toString(vect));
		
		for (int i = vect.length-1; i > posicao; i--) {
			vect[i] = vect[i-1];
		}
		
		vect[posicao] = novoValor;
		System.out.println(Arrays.toString(vect));
		
		sc.close();

	}

}
