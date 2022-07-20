package com.cg.onlineshoppingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineshoppingapplication.entities.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String> {

}
