package com.codecup.demo.repository;

import com.codecup.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // No need to write anything – built-in methods like save(), findAll() just work
    //Plus your custom findByUsername()
    User findByUsername(String username);
}

