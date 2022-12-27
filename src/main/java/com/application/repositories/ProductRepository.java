package com.application.repositories;

import com.application.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepositoryBean")
public interface ProductRepository extends JpaRepository<Product, Integer> { }
