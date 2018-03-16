package com.techelevator.ssg.model.store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTotal {
	private List<ShoppingCartItem> allCartItems = new ArrayList<>();
	


	public List<ShoppingCartItem> getAllCartItems() {
		return allCartItems;
	}

	public void setAllCartItems(List<ShoppingCartItem> cartTotal) {
		this.allCartItems = cartTotal;
	}
	
	//methods
	public BigDecimal getShoppingCartTotal() {
		BigDecimal sum = new BigDecimal("0");
		for(ShoppingCartItem item : allCartItems) {
			sum = sum.add(item.getProductPriceTotal());
		}
		return sum;
	}
	
	public void addItemToCart(ShoppingCartItem item) {
		allCartItems.add(item);
	}

	public Integer getTotalCartQuantity() {
		Integer totalQuantity = 0;
		for(ShoppingCartItem item : allCartItems) {
			totalQuantity += item.getQuantity();
			
		}
		return totalQuantity;
	}

	
	
	
}
