package com.rafael.ud_project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.ud_project.domain.Category;
import com.rafael.ud_project.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    public Category findById(Integer id) {
        Optional<Category> categoryExists = this.categoryRepository.findById(id);
        return categoryExists.orElse(null);
    }
}
