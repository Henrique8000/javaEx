package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static String path;
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter file full path: ");
			path = sc.nextLine();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<String> logs = new HashSet<>();
			
			String line = br.readLine();
			
			while (line != null) {
				
				String singleLine[] = line.split(" ");
				
				logs.add(singleLine[0]);
				
				line = br.readLine();
				
			}
			
			System.out.println("Total users: " + logs.size());
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
