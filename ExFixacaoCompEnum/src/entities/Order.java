package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("(dd/MM/yyyy)");
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.00;
		
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY" + "\n");
		sb.append("Order moment: " + sdf.format(moment) +"\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " - " + sdf2.format(moment) + " - " + client.getEmail() + "\n");
		sb.append("Order items:" + "\n");
		
		for (OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", ");
			sb.append("$" + item.getProduct().getPrice() + ", ");
			sb.append("Quantity: " + item.getQuantity() + ", ");
			sb.append("Subtotal: " + "$" + item.subTotal() + "\n");
		}
		
		sb.append("Total price: $" + total());
		
		return sb.toString();
	}
	
}
