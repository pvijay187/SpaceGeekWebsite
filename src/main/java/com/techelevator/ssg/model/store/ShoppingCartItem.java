package com.techelevator.ssg.model.store;

import java.math.BigDecimal;

public class ShoppingCartItem {
	private Integer quantity;
	private Product product;
	

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	//Methods
	public BigDecimal getProductPriceTotal() {
		BigDecimal quantity = new BigDecimal(this.quantity);
		BigDecimal productPriceTotal = quantity.multiply(product.getPrice());
		return productPriceTotal;
	}
	
	
	
}
