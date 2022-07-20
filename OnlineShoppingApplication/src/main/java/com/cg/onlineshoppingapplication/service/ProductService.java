package com.cg.onlineshoppingapplication.service;

import java.util.List;
import com.cg.onlineshoppingapplication.entities.Product;

public interface ProductService {
	List<Product> viewAllProducts();
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Product viewProduct(int id);
	List<Product> viewProductByCategory(String cname);
	Product removeProduct(int pid);
}
