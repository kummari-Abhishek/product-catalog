package com.ecom.product_catalog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.product_catalog.model.Product;
import com.ecom.product_catalog.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
	  private final ProductService productService;
	    
	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }
	    
	    @GetMapping
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }
	    
	    @GetMapping("/category/{categoryId}")
	    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId) {
	        return productService.getProductsByCategoryId(categoryId);
	    }
}
