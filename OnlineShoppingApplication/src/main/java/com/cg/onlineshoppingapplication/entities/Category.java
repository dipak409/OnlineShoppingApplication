package com.cg.onlineshoppingapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;
	private String categoryName;
	
	
	public Category() {
		super();
	}


	public Category(String cartId, String categoryName) {
		super();
		this.cartId = cartId;
		this.categoryName = categoryName;
	}


	public String getCartId() {
		return cartId;
	}


	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	@Override
	public String toString() {
		return "Category [cartId=" + cartId + ", categoryName=" + categoryName + "]";
	}
	
	
	
	}
