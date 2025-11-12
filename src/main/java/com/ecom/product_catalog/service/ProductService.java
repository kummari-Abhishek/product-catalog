package com.ecom.product_catalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.product_catalog.model.Product;
import com.ecom.product_catalog.repository.ProductRepository;

@Service
public class ProductService {
	 private final ProductRepository productRepository;
	    
	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }
	    
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }
	    
	    public List<Product> getProductsByCategoryId(Long categoryId) {
	        return productRepository.findByCategory_Id(categoryId);
	    }

}
