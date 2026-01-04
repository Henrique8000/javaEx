package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file path: ");
		String strPath = sc.nextLine();
		File file = new File(strPath);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			List<Product> products = new ArrayList<>();
			
			String line = br.readLine();
				
			while (line != null) {
				String[] singleLine = line.split(",");
					
				Double price = Double.parseDouble(singleLine[1]);
				Integer quantity = Integer.parseInt(singleLine[2]);
					
				products.add(new Product(singleLine[0], price, quantity));
					
				line = br.readLine();
			}
			
			String parentPath = file.getParent();
			
			new File(parentPath + "\\out").mkdir();
			
			String path = parentPath + "\\out\\summary.csv";
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				for (Product product : products) {
					bw.write(product.getProductName() + "," + String.format("%.2f", product.totalPrice()));
					bw.newLine();
				}
			}
			System.out.println("Success!");
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	
	}
}
	
