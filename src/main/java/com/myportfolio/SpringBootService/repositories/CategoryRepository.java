package com.myportfolio.SpringBootService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.SpringBootService.entities.Category;


public interface  CategoryRepository extends JpaRepository<Category, Long> {

}
