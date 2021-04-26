package com.myportfolio.SpringBootService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.SpringBootService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
