package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.revature.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
