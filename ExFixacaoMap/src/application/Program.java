package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> relatorio = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			
			String line = bf.readLine();
			
			while (line != null) {
				
				String[] singleLine = line.split(",");
				
				String nome = singleLine[0];
				Integer urna = Integer.parseInt(singleLine[1]);
				
				if (relatorio.containsKey(nome)) {
					
					int votos = relatorio.get(nome) + urna;
					relatorio.put(nome, votos);
				}
				else {
					relatorio.put(nome, urna);
				}
				
				line = bf.readLine();
				
			}
			
			for (String key : relatorio.keySet()) {
				System.out.println(key + ": " + relatorio.get(key));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Error:" + e.getMessage());
		}
		finally {
			sc.close();
		}
			
	
	}
}
