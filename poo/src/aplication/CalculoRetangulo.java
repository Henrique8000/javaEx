package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class CalculoRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		
		System.out.println("Enter rectangle width and height:");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();

	}

}
