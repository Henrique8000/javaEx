package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> empList = new ArrayList<>();
		
		System.out.println();
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			
			System.out.println("Employee #" + (i+1) + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char condEmp = sc.next().toLowerCase().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (condEmp == 'y') {
				
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				
				empList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			
			else {
				empList.add(new Employee(name, hours, valuePerHour));
			}
			
			System.out.println();
		}
		
		System.out.println("PAYMENT:");
		for (Employee emp : empList)
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		
		
		sc.close();
	}

}
