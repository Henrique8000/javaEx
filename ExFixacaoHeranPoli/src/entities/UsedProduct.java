package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name)
		.append(" (used) ")
		.append("$ ")
		.append(String.format("%.2f", price))
		.append(" (Manufacture date: ")
		.append(sdf.format(manufactureDate))
		.append(")");
		
		return sb.toString();
	}
	
}
