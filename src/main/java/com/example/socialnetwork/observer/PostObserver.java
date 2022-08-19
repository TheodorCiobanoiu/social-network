package com.example.socialnetwork.observer;


import com.example.socialnetwork.model.Comment;
import com.example.socialnetwork.model.Post;

import java.util.Observable;
import java.util.Observer;

public class PostObserver{

    private final Post observedPost;

    public PostObserver(Post p){
        this.observedPost = p;
    }

    public void notify(Comment comment) {
        System.out.println(observedPost.getUser() + " "
                + "You have a new comment. "
                + comment.getContent());
    }
}
