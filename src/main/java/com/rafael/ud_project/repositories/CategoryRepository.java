package com.rafael.ud_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.ud_project.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {    
}
