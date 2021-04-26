package com.myportfolio.SpringBootService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.SpringBootService.entities.OrderItem;


public interface  OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
