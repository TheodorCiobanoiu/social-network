package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Comment;
import com.example.socialnetwork.model.React;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> findAll();
}
