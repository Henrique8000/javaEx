package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	
		double areaX = x.areaTriangulo();
	
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.areaTriangulo();
		
		System.out.printf("Triangle X area: %.4f", areaX);
		System.out.printf("%nTriangle Y area: %.4f", areaY);
		x.exibeMaiorArea(areaX, areaY);
		
		sc.close();
	}
	

}
