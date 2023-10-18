package com.rafael.ud_project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.ud_project.domain.Category;
import com.rafael.ud_project.services.CategoryService;

@RestController
@RequestMapping( value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping( value = "/{id}" )
    public ResponseEntity<Category> find(@PathVariable Integer id) {
        Category category = this.categoryService.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
