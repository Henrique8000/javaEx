package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int num = sc.nextInt();
		
		System.out.println();
		
		List<Shape> shapes = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			sc.nextLine();
			System.out.printf("Shape #%d data:%n", i+1);
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char op = sc.next().toLowerCase().charAt(0);
			
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (op == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			}
			
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
			
			System.out.println();
		}
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : shapes) System.out.println(String.format("%.2f", shape.area()));
		
		sc.close();

	}

}
