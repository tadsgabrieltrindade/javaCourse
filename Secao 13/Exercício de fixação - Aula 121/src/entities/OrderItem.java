package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(Product product, Integer quantity) {
		this.price = product.getPrice();
		this.quantity = quantity;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getProductName() {
		return product.getName();
	}

	public Double subTotoal() {
		return quantity*price;
	}
}
