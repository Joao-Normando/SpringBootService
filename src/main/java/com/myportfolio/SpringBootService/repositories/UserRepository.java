package com.myportfolio.SpringBootService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.SpringBootService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
