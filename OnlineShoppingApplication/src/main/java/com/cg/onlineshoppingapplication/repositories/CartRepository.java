package com.cg.onlineshoppingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineshoppingapplication.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String>{

}
