package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Quadrado;

public class CalculaAreaQuadrado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quadrado lado1, lado2, lado3, lado4;
		lado1 = new Quadrado();
		lado2 = new Quadrado();
		lado3 = new Quadrado();
		lado4 = new Quadrado();
		
		exibeMsg1();
		lado1.l1 = sc.nextDouble();
		sc.nextLine();
		exibeMsg2();
		lado2.l2 = sc.nextDouble();
		exibeMsg3();
		lado3.l3 = sc.nextDouble();
		exibeMsg4();
		lado4.l4 = sc.nextDouble();
		
		
		double area = calculaQuadrado(lado1.l1, lado2.l2);
		System.out.printf("%nPelos meus calculos, o seu quadrado tem: %.2fm²", area);
		
		double perimetro = calculaPerimetroQuadrado(lado1.l1, lado2.l2, lado3.l3, lado4.l4);
		System.out.printf("%nPelos meus calculos, o seu quadrado tem um perimetro de: %.2f", perimetro);
		
		
		sc.close();

	}
	public static void exibeMsg1() {
		System.out.print("BEM VINDO(A) A CALCULADORA DE AREA DE UM QUADRADO!\n");
		System.out.print("\nInsira o comprimento do lado 1: ");	
	}
	
	public static void exibeMsg2() {
		System.out.print("Insira o comprimento do lado 2: ");
	}
	
	public static void exibeMsg3() {
		System.out.print("Insira o comprimento do lado 3: ");
	}
	
	public static void exibeMsg4() {
		System.out.print("Insira o comprimento do lado 4: ");
	}
	
	public static double calculaQuadrado(double a, double b) {
		double areaQuadrado = a * b;
		return areaQuadrado;
	}
	
	public static double calculaPerimetroQuadrado(double x, double y, double z, double f) {
		double p = x + y + z + f;
		return p;
	}
	
}