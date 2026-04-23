package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.lang.System.*;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
			
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> listEmps = new ArrayList<>();;
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] singleLine = line.split(",");
				listEmps.add(new Employee(singleLine[0], singleLine[1], Double.parseDouble(singleLine[2])));
				line = br.readLine();
			}
			
			List<String> emailList = listEmps.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emailList.forEach(out::println);
			
			double sum = listEmps.stream()
					.filter(emp -> emp.getName().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (x, y) -> x + y);
		
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
