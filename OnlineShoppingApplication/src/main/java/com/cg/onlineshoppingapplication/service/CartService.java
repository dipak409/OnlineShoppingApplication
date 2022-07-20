package com.cg.onlineshoppingapplication.service;

import com.cg.onlineshoppingapplication.entities.Cart;
import com.cg.onlineshoppingapplication.entities.Product;

public interface CartService {
	
	Cart addProductToCart(Cart cart,Product p,int quantity);
	Cart removeProductToCart(Cart cart,Product p);
	Cart updateProductQuantity(Cart cart,Product p,int quantity);
	Cart removeAllProducts(Cart cart);
	Cart viewAllProducts(Cart cart);

}
