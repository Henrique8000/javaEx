package model.entites;

public class Product {
	private String productName;
	private Double price;
	private Integer quantity;
	
	public Product() {
	}

	public Product(String productName, Double price, Integer quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double totalPrice() {
		return quantity * price;
	}
	
	
}
