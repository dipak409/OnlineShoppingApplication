package com.cg.onlineshoppingapplication.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineshoppingapplication.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
