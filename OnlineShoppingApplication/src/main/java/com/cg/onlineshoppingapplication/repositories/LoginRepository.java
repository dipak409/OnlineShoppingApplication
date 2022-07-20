package com.cg.onlineshoppingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineshoppingapplication.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
