package com.rafael.ud_project.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.ud_project.domain.Category;
import com.rafael.ud_project.repositories.CategoryRepository;
import com.rafael.ud_project.services.exceptions.NotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    public Category findById(Integer id) {
        Optional<Category> categoryExists = this.categoryRepository.findById(id);
        return categoryExists.orElseThrow(() -> new NotFoundException("Category not founded."));
    }
}
