package com.example.sqllitedemo;

import com.example.sqllitedemo.entity.User;
import com.example.sqllitedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlLiteDemoApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(SqlLiteDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("John Doe", "a"));
    }
}
