package com.rafael.ud_project.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.ud_project.domain.Category;

@RestController
@RequestMapping( value = "/categories")
public class CategoryResource {

    @GetMapping
    public List<Category> list() {
        Category category = new Category(1, "Games");
        Category category2 = new Category(2, "Softwares");

        List<Category> listCategories = new ArrayList<>();
        listCategories.add(0, category);
        listCategories.add(0, category2);

        return listCategories;
    }
}
