package com.ecom.product_catalog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Product {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String name;
	    private String description;
	    private String imageUrl;
	    private Double price;
	    
	    @ManyToOne
	    @JoinColumn(name = "category_id", nullable = false)
	    @JsonBackReference
	    private Category category;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}
		public Product() {}

		public Product(String name, String description,
	               double price, String imageUrl, Category category) {
	    this.name = name;
	    this.description = description;
	    this.price = price;
	    this.imageUrl = imageUrl;
	    this.category = category;
	}
	  

}
