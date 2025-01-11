package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double areaRetangulo() {
		double area = largura * altura;
		return area;
	}
	
	public double perimetroRetangulo() {
		double perimetro = (largura + largura) + (altura + altura);
		return perimetro;
	}
	
	public double diagonalRetangulo() {
		double diagonal = Math.sqrt((Math.pow(altura, 2)) + (Math.pow(largura, 2)));
		return diagonal; 
	}

	public String toString() {
		return "AREA = " + String.format("%.2f%n", areaRetangulo())
				+ "PERIMETER = " + String.format("%.2f%n", perimetroRetangulo())
				+ "DIAGONAL = " + String.format("%.2f", diagonalRetangulo());
	}

}
