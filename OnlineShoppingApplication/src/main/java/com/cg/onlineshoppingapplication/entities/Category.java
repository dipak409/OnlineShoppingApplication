package com.cg.onlineshoppingapplication.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cg.onlineshopping_application.entity.JsonIgnore;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;
	private String categoryName;
	

	@OneToMany(mappedBy="category")
	private List<Product> product;
	
	
	public Category() {
		super();
	}


	public Category(String cartId, String categoryName, List<Product> product) {
		super();
		this.cartId = cartId;
		this.categoryName = categoryName;
		this.product = product;
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


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Category [cartId=" + cartId + ", categoryName=" + categoryName + ", product=" + product + "]";
	}
	
	
	
	
	
	}
