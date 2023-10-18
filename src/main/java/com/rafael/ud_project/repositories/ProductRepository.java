package com.rafael.ud_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.ud_project.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {    
}
