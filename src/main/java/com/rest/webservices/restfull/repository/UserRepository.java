package com.rest.webservices.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restfull.User.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
