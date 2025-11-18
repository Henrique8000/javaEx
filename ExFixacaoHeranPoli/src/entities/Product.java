package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
	protected String name;
	protected Double price;
	
	List<Product> products = new ArrayList<>();
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}

	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" $ ").append(String.format("%.2f", price));
		return sb.toString();
	}
	
}
