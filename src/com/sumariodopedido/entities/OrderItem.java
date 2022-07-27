package com.sumariodopedido.entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {}
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
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
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		this.price = this.product.getPrice() * this.quantity;
		return this.price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.product.getName());
		sb.append(", $ " + String.format("%.2f", this.product.getPrice()));
		sb.append(", Quantity: " + this.quantity);
		sb.append(", Subtotal: $ " + String.format("%.2f", this.price));
		
		return sb.toString();
		
	}
}
