package com.cg.onlineshoppingapplication.service;

import org.springframework.stereotype.Service;

import com.cg.onlineshoppingapplication.entities.Cart;
import com.cg.onlineshoppingapplication.entities.Product;

@Service
public class CartServiceImpl implements CartService {

	@Override
	public Cart addProductToCart(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return null;
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
