package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAll();
    public List<User> findAllByName(String name);
}
