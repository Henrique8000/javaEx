package entities;

public class Product {
	
	private String nome;
	private Double price;
	
	public Product() {
	}
	
	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0; 
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0; 
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		price *= 1.1;
	}
	
	public static String staticUpperCaseName(Product p) {
		return p.getNome().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return nome.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [nome=" + nome + ", price=" + String.format("%.2f", price) + "]";
	}
	
	
}
