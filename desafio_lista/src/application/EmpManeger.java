package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import util.EmployeeUtil;

public class EmpManeger {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int num = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i=0; i<num; i++) {
			System.out.printf("%nEmplyoee #%d:", i+1);
			
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			
			while (EmployeeUtil.duplicatedID(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		Integer idQuery = sc.nextInt();
		
		Employee result = EmployeeUtil.hasID(list, idQuery);
		
		if (result == null) {
			System.out.println("This id does not exist!\n");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
			System.out.println();
		}
		
		EmployeeUtil.getAllEmps(list);
		
		sc.close();

	}

}
