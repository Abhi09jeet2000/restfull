package com.rest.webservices.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restfull.post.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
    
}
