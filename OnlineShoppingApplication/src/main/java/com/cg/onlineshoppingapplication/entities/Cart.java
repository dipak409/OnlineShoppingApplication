package com.cg.onlineshoppingapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;
	//OneToOne
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private Customer customer;

	//@OneToOne
	//private Map products;
	
	


	public Cart() {
		super();
	}

	public Cart(String cartId, Product product, Customer customer) {
		super();
		this.cartId = cartId;
		this.product = product;
		this.customer = customer;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", product=" + product + ", customer=" + customer + "]";
	}

	

		
		
}
