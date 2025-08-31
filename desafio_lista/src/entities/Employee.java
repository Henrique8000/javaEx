package entities;

import java.util.List;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += (salary * percentage) / 100; 
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + "R$" + String.format("%.2f", salary); 
	}
	
}
