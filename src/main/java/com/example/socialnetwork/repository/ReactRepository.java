package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.React;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReactRepository extends JpaRepository<React, Integer> {
    public List<React> findAll();
}
