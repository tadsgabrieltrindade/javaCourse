package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Client client;
	
	public  Order(Client client, String status) {
		this.client = client;
		this.status = OrderStatus.valueOf(status); 
		this.moment = new Date();
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
		items.remove(0);
	}
	
	public Double total() {
		double total = 0;
		for(OrderItem l: items) {
			total = total + l.subTotoal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n------ORDER SUMMARY: \n");
		sb.append("Order moment: " + this.sdf.format(moment) + "\n");
		sb.append("Order status: " + status);
		sb.append("\nClient: " + client.getName());
		sb.append("(" + client.getBithDate() + ")");
		sb.append(" - " + client.getEmail());
		sb.append("\nOrder items:" );
		for(OrderItem oi : items) {
			sb.append("\n" + oi.getProductName() + ", ");
			sb.append("Quantity: " + oi.getQuantity() + ", ");
			sb.append("Subtotal: U$" + oi.subTotoal());
		}
		sb.append("\nTotal price: U$" + total());
		return sb.toString();
	}
	
}

