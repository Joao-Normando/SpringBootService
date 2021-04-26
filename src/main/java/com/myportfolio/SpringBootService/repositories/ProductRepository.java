package com.myportfolio.SpringBootService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.SpringBootService.entities.Product;


public interface  ProductRepository extends JpaRepository<Product, Long> {

}
