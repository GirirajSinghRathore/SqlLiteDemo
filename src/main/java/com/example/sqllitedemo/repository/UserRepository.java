package com.example.sqllitedemo.repository;

import com.example.sqllitedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
