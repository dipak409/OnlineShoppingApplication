package com.cg.onlineshoppingapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshoppingapplication.entities.Cart;
import com.cg.onlineshoppingapplication.entities.Product;
import com.cg.onlineshoppingapplication.repositories.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	private CartRepository cartRepository;
	
	
	
	public CartServiceImpl(CartRepository cartRepository) {
		super();
		this.cartRepository = cartRepository;
	}

	@Override
	public Cart addProductToCart(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public Cart removeProductToCart(Cart cart, Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateProductQuantity(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeAllProducts(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart viewAllProducts(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
