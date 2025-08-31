package util;

import java.util.List;

import entities.Employee;

public class EmployeeUtil {
	
	public static boolean duplicatedID(List<Employee> list, Integer id) {
		Employee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Employee hasID(List<Employee> list, Integer idQuery) {
		Employee result = list.stream().filter(x -> x.getId().equals(idQuery)).findFirst().orElse(null);
		
		return result;
	}
	
	public static void getAllEmps(List<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	
}
