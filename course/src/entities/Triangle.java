package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
		
	public double areaTriangulo() {
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
		
	}
	
	public void exibeMaiorArea(double areaX, double areaY) {
		if (areaX > areaY) {
			System.out.println("\nLarger area: X");
		}
		else if (areaY > areaX) {
			System.out.println("\nLarger area: Y");
		}
		else {
			System.out.println("\nX and Y are equal");
		}
	}
}
