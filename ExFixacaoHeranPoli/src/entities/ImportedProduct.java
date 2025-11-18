package entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String nome, Double price, Double customsFee) {
		super(nome, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name)
		.append(" $ ")
		.append(String.format("%.2f", totalPrice()))
		.append(" (Customs fee: $ ")
		.append(String.format("%.2f", customsFee))
		.append(")");
		
		return sb.toString();
	}
	
}
