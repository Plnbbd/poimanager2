package com.poimanager.poimanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poimanager.poimanager.model.Category;
import com.poimanager.poimanager.service.CategoryService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "joyful-cucurucho-727ab9.netlify.app")
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}

