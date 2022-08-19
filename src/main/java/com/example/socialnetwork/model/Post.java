package com.example.socialnetwork.model;

import com.example.socialnetwork.observer.PostObserver;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<React> reactList;
    private String content;
    @Transient
    PostObserver postObserver;

    public void addObserver(){
        this.postObserver = new PostObserver(this);
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
        postObserver.notify(comment);

    }
    public void addReaction(React react){
        this.reactList.add(react);
    }
}
