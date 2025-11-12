package com.ecom.product_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.product_catalog.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}


