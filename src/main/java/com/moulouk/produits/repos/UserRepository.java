package com.moulouk.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moulouk.produits.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
