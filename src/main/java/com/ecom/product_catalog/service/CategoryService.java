package com.ecom.product_catalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.product_catalog.model.Category;
import com.ecom.product_catalog.repository.CategoryRepository;
@Service
public class CategoryService {

	 private final CategoryRepository categoryRepository;
	    
	    public CategoryService(CategoryRepository categoryRepository) {
	        this.categoryRepository = categoryRepository;
	    }
	    
	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }
}
