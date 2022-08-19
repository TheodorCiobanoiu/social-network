package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.model.React;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    public List<Post> findAll();
//    public List<Post> getTop10Posts();
}
