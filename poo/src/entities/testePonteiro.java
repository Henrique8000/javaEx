package entities;

public class testePonteiro {
	private String product;
	private double price;
	private int quantity;
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public testePonteiro(String product, double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
}
