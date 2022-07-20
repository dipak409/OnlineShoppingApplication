package com.cg.onlineshoppingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineshoppingapplication.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
