package aplication;

import java.util.Locale;
import java.util.Scanner;

import	entities.Product;

public class ProgramaProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
	
		
		System.out.println("Enter porduct data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantityy in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
	    System.out.println("Uptated data: " + product);
		
		sc.close();

	}

}
